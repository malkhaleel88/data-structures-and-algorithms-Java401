package challenge35;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> adjVertices;

    Graph() {
        adjVertices = new HashMap<>();
    }

    /**
     * Code Challenge 35
     */

    public Vertex addNode(String value) {
        Vertex node = new Vertex(value);
        adjVertices.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    public void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    public Set<Vertex> getNodes() {
        return adjVertices.keySet();
    }

    public List<Vertex> getNeighbors(String data) {
        Vertex vertex = new Vertex(data);
        return adjVertices.get(vertex);
    }

    public int size() {
        return adjVertices.size();
    }

    public String printGraph() {
        String print = "";
        for (Vertex vertex : adjVertices.keySet()) {
            var targets = adjVertices.get(vertex);
            if (!targets.isEmpty())
                print += "\n" + vertex + " is connected to " + targets;
        }
        return print;
    }

    /**
     * Code Challenge 36
     */

    public Set<String> breadthTraverse(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : getNeighbors(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }

    /**
     * Code Challenge 37
     */

    public void addEdgeWithWeight(String data1, String data2, int weight) {
        Vertex Vertex1 = new Vertex(data1, weight);
        Vertex Vertex2 = new Vertex(data2, weight);


        adjVertices.get(Vertex1).add(Vertex2);
        adjVertices.get(Vertex2).add(Vertex1);
    }

    public String businessTrip(Graph graph, List<String> citiesNames) {
        int cost = 0;
        if (citiesNames.size() <= 1)
            return "null";

        int findWeight;
        for (int i = 0; i < citiesNames.size() - 1; i++) {
            findWeight = findWeight(graph, citiesNames.get(i), citiesNames.get(i + 1));

            if (findWeight == 0)
                return "False, $0";

            cost += findWeight;
        }
        return "True, $" + cost;
    }

    private int findWeight(Graph graph, String city1, String city2) {
        for (Vertex vertex : graph.getNeighbors(city1)) {
            if (Objects.equals(city2, vertex.label)) {
                return vertex.weight;
            }
        }
        return 0;
    }


}
