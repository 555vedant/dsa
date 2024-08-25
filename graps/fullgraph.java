package graps;

import java.util.*;

public class fullgraph {
    class Node {
        int sou;
        int des;

        // If weight of graph exists then put here
        public Node(int sou, int des) {
            this.sou = sou;
            this.des = des;
        }

        @Override
        public String toString() {
            return "(" + sou + " -> " + des + ")";
        }
    }

    public void createGraph(ArrayList<ArrayList<Node>> graph, int v) {
        // Initialize the graph with empty lists
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        graph.get(0).add(new Node(0, 2));

        graph.get(1).add(new Node(1, 2));
        graph.get(1).add(new Node(1, 3));

        graph.get(2).add(new Node(2, 0));
        graph.get(2).add(new Node(2, 1));
        graph.get(2).add(new Node(2, 3));

        graph.get(3).add(new Node(3, 1));
        graph.get(3).add(new Node(3, 2));
    }

    // code for bfs of traversal
    public static void bfs(ArrayList<ArrayList<Node>> graph, int V) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // Source = 0
        while (!q.isEmpty()) {

            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph.get(i).size(); i++) {
                    Node e = graph.get(i).get(i);
                    q.add(e.des);
                }
            }
        }
        System.out.println();
    }

    public void dfs(ArrayList<ArrayList<Node>> graph, int v, int current) {
        boolean visited[] = new boolean[v];
        // Stack<Integer> s = new Stack<>();
        System.out.println(current);
        visited[current] = true;
        for (int i = 0; i < graph.get(i).size(); i++) {
            Node e = graph.get(i).get(i);
            if (!visited[e.des]) {
                dfs(graph, v, e.des);
                
            }

        }

    }

    public static void main(String[] args) {
        fullgraph g = new fullgraph();
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        g.createGraph(graph, 4);
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("Node " + i + " connected to: " + graph.get(i));
        }
    }
}
