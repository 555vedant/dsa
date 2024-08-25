package graps;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class djkstras {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    class pair implements Comparable<pair> {
        int value;
        int weight;

        public pair(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public int compareTo(pair another) {
            return this.weight = another.weight;
        }
    }

    public void algo(boolean valid[], int v, int dis[], Edge current, ArrayList<ArrayList<Edge>> graph) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(current.src, current.wt));
        valid[current.src] = true;
        while (pq.isEmpty()) {
            

            for (int i = 0; i < graph.get(i).size(); i++) {
                Edge ele = graph.get(i).get(i);
                if (valid[ele.dest] == false) {
                    pq.add(new pair(ele.dest, ele.wt));
                }

            }

        }

    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static void main(String[] args) {
        int v = 6;
        int dist[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (i != 0) {
                dist[i] = Integer.MAX_VALUE;

            }
        }

    }

}
