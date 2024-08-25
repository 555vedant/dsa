package graps;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        // Establish neighbors
        node1.neighbors.add(node2);
        node1.neighbors.add(node3);

        node2.neighbors.add(node1);

        node3.neighbors.add(node1);

        // Print out the graph structure
        printGraph(node1);
    }

    public static void printGraph(Node node) {
        // Use a set to track visited nodes to avoid infinite loops in cyclic graphs
        Set<Node> visited = new HashSet<>();
        dfs(node, visited);
    }

    private static void dfs(Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.print("Node " + node.val + " neighbors: ");
        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }
        System.out.println();

        for (Node neighbor : node.neighbors) {
            dfs(neighbor, visited);
        }
    }
}
