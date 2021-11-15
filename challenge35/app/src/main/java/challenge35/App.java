/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge35;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        /**
         * Code Challenge 35
         */

        Graph graph = new Graph();

        graph.addNode("Mohammad");
        graph.addNode("Ghadeer");
        graph.addNode("Naim");
        graph.addNode("Osaid");

        graph.addEdge("Mohammad", "Ghadeer");
        graph.addEdge("Mohammad", "Naim");
        graph.addEdge("Mohammad", "Osaid");
        graph.addEdge("Ghadeer", "Naim");
        graph.addEdge("Naim", "Osaid");
        graph.addEdge("Osaid", "Ghadeer");

        System.out.println(graph.printGraph());

        System.out.println();
        System.out.println(graph.getNodes());

        System.out.println();
        System.out.println(graph.getNeighbors("Mohammad"));

        System.out.println();
        System.out.println(graph.size());

        System.out.println("==========================================");

        /**
         * Code Challenge 36
         */

        Graph graph1 = new Graph();

        graph1.addNode("Pandora");
        graph1.addNode("Arendelle");
        graph1.addNode("Metroville");
        graph1.addNode("Monstroplolis");
        graph1.addNode("Narnia");
        graph1.addNode("Naboo");

        graph1.addEdge("Pandora", "Arendelle");
        graph1.addEdge("Arendelle", "Metroville");
        graph1.addEdge("Arendelle", "Monstroplolis");
        graph1.addEdge("Metroville", "Narnia");
        graph1.addEdge("Metroville", "Naboo");
        graph1.addEdge("Metroville", "Monstroplolis");
        graph1.addEdge("Monstroplolis", "Naboo");
        graph1.addEdge("Narnia", "Naboo");


        System.out.println(graph1.breadthTraverse("Pandora"));

        System.out.println("==========================================");

        /**
         * Code Challenge 37
         */

        Graph graph2 = new Graph();

        graph2.addNode("Pandora");
        graph2.addNode("Arendelle");
        graph2.addNode("Metroville");
        graph2.addNode("Monstropolis");
        graph2.addNode("Narnia");
        graph2.addNode("Naboo");

        graph2.addEdgeWithWeight("Pandora", "Arendelle", 150);
        graph2.addEdgeWithWeight("Pandora", "Metroville", 82);
        graph2.addEdgeWithWeight("Arendelle", "Metroville",99);
        graph2.addEdgeWithWeight("Arendelle", "Monstropolis",42);
        graph2.addEdgeWithWeight("Metroville", "Narnia",37);
        graph2.addEdgeWithWeight("Metroville", "Naboo",26);
        graph2.addEdgeWithWeight("Metroville", "Monstropolis",105);
        graph2.addEdgeWithWeight("Monstropolis", "Naboo",73);
        graph2.addEdgeWithWeight("Narnia", "Naboo",250);

        List<String> cities = new ArrayList<>();
        cities.add("Pandora");
        cities.add("Arendelle");
        cities.add("Metroville");

        List<String> cities1 = new ArrayList<>();
        cities1.add("Pandora");
        cities1.add("Naboo");
        cities1.add("Metroville");


        System.out.println("First Trip ---> " + graph2.businessTrip(graph2, cities));
        System.out.println("Second Trip ---> " + graph2.businessTrip(graph2, cities1));
    }
}
