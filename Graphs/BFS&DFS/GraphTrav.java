
import java.util.*;

class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class Graph {

    public void createGraph(ArrayList<Edge> graph[]) { // function to create a graph
        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(1, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    // function to find the BFS of a Graph
    public void BFS(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0); // source

        while (!q.isEmpty()) {
            int current = q.remove();
            if (!visited[current]) {
                System.out.print(current + " ");
                visited[current] = true;
                for (int i = 0; i < graph[current].size(); i++) { // loop to get the neighbours of a current node
                    Edge e = graph[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    // function to find the DFS of a Graph
    public void DFS(ArrayList<Edge>[] graph, int current, boolean visited[]) {
        System.out.print(current + " ");
        visited[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!visited[e.destination])
                DFS(graph, e.destination, visited);
        }
    }
}

public class GraphTrav {
    public static void main(String[] args) {
        Graph g = new Graph();

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[7];

        g.createGraph(graph);
        System.out.print("BFS : ");
        g.BFS(graph);
        System.out.print("\nDFS : ");
        g.DFS(graph, 0, new boolean[7]);
    }
}
