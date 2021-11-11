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

}
