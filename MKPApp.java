import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MKPApp extends JFrame {
    private JTextField nField, mField, profitsField, weightsField, capacitiesField;
    private JTextArea resultArea;

    public MKPApp() {
        setTitle("Hybrid ACO for Multiple Knapsack Problem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));
        setSize(500, 300);

        // Input Fields
        add(new JLabel("Number of Items (n):"));
        nField = new JTextField();
        add(nField);

        add(new JLabel("Number of Knapsacks (m):"));
        mField = new JTextField();
        add(mField);

        add(new JLabel("Profits (comma-separated):"));
        profitsField = new JTextField();
        add(profitsField);

        add(new JLabel("Weights (comma-separated):"));
        weightsField = new JTextField();
        add(weightsField);

        add(new JLabel("Capacities (comma-separated):"));
        capacitiesField = new JTextField();
        add(capacitiesField);

        // Buttons
        JButton runButton = new JButton("Run Algorithm");
        runButton.addActionListener(e -> runAlgorithm());
        add(runButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> clearFields());
        add(clearButton);

        // Output Area
        add(new JLabel("Result:"));
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void runAlgorithm() {
        try {
            int n = Integer.parseInt(nField.getText());
            int m = Integer.parseInt(mField.getText());
            int[] profits = parseArray(profitsField.getText(), n);
            int[] weights = parseArray(weightsField.getText(), n);
            int[] capacities = parseArray(capacitiesField.getText(), m);

            int[] solution = hybridAcoMkp(n, m, profits, weights, capacities);
            int totalValue = calculateTotalValue(solution, profits);

            resultArea.setText("Selected Items: " + Arrays.toString(solution) + "\nTotal Value: " + totalValue);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int[] parseArray(String input, int expectedLength) {
        String[] parts = input.split(",");
        if (parts.length != expectedLength) {
            throw new IllegalArgumentException("Input length does not match expected size!");
        }
        int[] result = new int[expectedLength];
        for (int i = 0; i < expectedLength; i++) {
            result[i] = Integer.parseInt(parts[i].trim());
        }
        return result;
    }

    private int[] hybridAcoMkp(int n, int m, int[] profits, int[] weights, int[] capacities) {
        Random rand = new Random();
        double[] pheromones = new double[n];
        Arrays.fill(pheromones, 1.0); // Initial pheromone values
        int[] bestSolution = new int[n];
        int bestValue = 0;
        int iterations = 50;
        int ants = 10;

        for (int iter = 0; iter < iterations; iter++) {
            for (int ant = 0; ant < ants; ant++) {
                int[] solution = new int[n];
                int[] currentWeights = new int[m];

                // ACO: Construct solution
                for (int i = 0; i < n; i++) {
                    double prob = pheromones[i] * profits[i] / (double) weights[i];
                    if (rand.nextDouble() < prob / (1 + prob) && canAddItem(weights[i], currentWeights, capacities)) {
                        solution[i] = 1;
                        for (int j = 0; j < m; j++) {
                            currentWeights[j] += weights[i]; // Simplified: assign to all knapsacks
                        }
                    }
                }

                // Local Search: Greedy refinement
                int totalValue = calculateTotalValue(solution, profits);
                for (int i = 0; i < n; i++) {
                    if (solution[i] == 0 && canAddItem(weights[i], currentWeights, capacities)) {
                        solution[i] = 1;
                        totalValue += profits[i];
                        for (int j = 0; j < m; j++) {
                            currentWeights[j] += weights[i];
                        }
                    }
                }

                // Update best solution
                if (totalValue > bestValue) {
                    bestValue = totalValue;
                    bestSolution = solution.clone();
                }
            }

            // Update pheromones
            for (int i = 0; i < n; i++) {
                pheromones[i] *= 0.9; // Evaporation
                if (bestSolution[i] == 1) {
                    pheromones[i] += bestValue / (double) n; // Reinforcement
                }
            }
        }

        return bestSolution;
    }

    private boolean canAddItem(int weight, int[] currentWeights, int[] capacities) {
        for (int j = 0; j < currentWeights.length; j++) {
            if (currentWeights[j] + weight > capacities[j]) {
                return false;
            }
        }
        return true;
    }

    private int calculateTotalValue(int[] solution, int[] profits) {
        int total = 0;
        for (int i = 0; i < solution.length; i++) {
            if (solution[i] == 1) {
                total += profits[i];
            }
        }
        return total;
    }

    private void clearFields() {
        nField.setText("");
        mField.setText("");
        profitsField.setText("");
        weightsField.setText("");
        capacitiesField.setText("");
        resultArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MKPApp::new);
    }
}