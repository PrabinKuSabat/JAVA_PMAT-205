package main;
import main.Algorithms.*;
import main.Graph.*;
import main.Graph.Elements.Node;
import main.utils.*;
import java.util.LinkedList;

public class DijkstraDriver {
    public static void main(String[] args) {
        // Create a graph using interactive Graph constructor.
        Graph graph = new Graph();
        
        // (Optional) Print the graph's current state.
        System.out.println("Graph vertices and edges:");
        graph.print();
        
        // Ensure the graph has at least one vertex to serve as the source.
        if (graph.getVertices().isEmpty()) {
            System.out.println("The graph has no vertices.");
            return;
        }
        
        // For demonstration purposes, select the first vertex as the source.
        Node source = graph.getVertices().get(0);
        System.out.println("\nSelected source node:");
        System.out.println(source);
        
        // Create a DijkstraAlgorithm instance and execute the algorithm.
        DijkstraAlgorithm algorithm = new DijkstraAlgorithm(graph);
        try {
            algorithm.execute(source);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        // For demonstration, if there is more than one vertex, choose the second as target.
        if (graph.getVertices().size() > 1) {
            Node target = graph.getVertices().get(1);
            try {
                LinkedList<Node> path = algorithm.getPath(target);
                System.out.println("\nShortest path from source to target:");
                for (Node node : path) {
                    System.out.println(node);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Not enough vertices to compute a path.");
        }
    }
}
