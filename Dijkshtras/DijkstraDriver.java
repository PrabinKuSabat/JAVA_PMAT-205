package main;
import main.Algorithms.*;
import main.Graph.*;
import main.Graph.Elements.Edge;
import main.Graph.Elements.Node;
import main.utils.*;
import java.util.LinkedList;
import java.util.Random;

public class DijkstraDriver {
    public static void main(String[] args) {
        // Creates a graph using interactive Graph constructor.
        Graph graph;
        String id;
        String name;
        LinkedList<Node> vertices = new LinkedList<>();
        LinkedList<Edge> edges = new LinkedList<>();
        Random random = new Random(12345);
        int noOfNodes = 20;
        int maxEdges = 20*(20-1);

        // Automatically adds nodes
        for (int i = 0; i < 20; i++) {
            id = Integer.toString(i);  // Assigns id as a string representation of the loop index.
            name = "Node_" + i;        // Assigns a name for the node, e.g., "Node_1", "Node_2", etc.
            
            // Create a new node and add it to the vertices list.
            Node node = new Node(id, name);
            vertices.add(node);
        }

        int totalEdge = Validator.getInt("Enter the total no. of Edges required: (Max. is " + maxEdges + ".)\n");
        // Automatically adds edges between nodes.
        for (int i = 0; i < totalEdge; i++) {  // Creating 40 edges (can adjust based on graph complexity).
            // Randomly selects source and destination nodes from the vertices list.
            Node source = vertices.get((int) (random.nextDouble(0, 1) * vertices.size()));
            Node destination = vertices.get((int) (random.nextDouble(0, 1) * vertices.size()));
            
            // Ensures source and destination are not the same.
            while (source.equals(destination)) {
                destination = vertices.get((int) (random.nextDouble(0, 1) * vertices.size()));
            }
            
            // Assigns a random weight (for example, between 1 and 100).
            int weight = random.nextInt(100) + 1;
            
            // Creates a new edge with unique id, source, destination, and weight.
            id = "Edge_" + i;  // Assign edge id, e.g., "Edge_1", "Edge_2", etc.
            Edge edge = new Edge(id, source, destination, weight);
            
            // Add the edge to the edges list.
            edges.add(edge);
        }

        // Creates the graph with the auto-generated vertices and edges.
        graph = new Graph(vertices, edges);
            
        // Vertices present in the Graph.
        System.out.println("Graph vertices and edges:");
        graph.printVertices();
        
        // Ensure the graph has at least one vertex to serve as the source.
        if (graph.getVertices().isEmpty()) {
            System.out.println("The graph has no vertices.");
            return;
        }
        
        // Takes source node as input from user.
        Node source;
        do{
            source = new Node();
        }while(!graph.getVertices().contains(source));
        System.out.println("\nSelected source node:");
        System.out.println(source);
        System.out.println();
        
        // Creates a DijkstraAlgorithm instance and executes the algorithm.
        DijkstraAlgorithm algorithm = new DijkstraAlgorithm(graph);
        try {
            algorithm.execute(source);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        LinkedList<Edge> pathToNeighbours = algorithm.getNeighbours(source);
        System.out.println("Negihbours of the source (" + source.toString() + " )  are: ");
        for(Edge edge : pathToNeighbours){
            System.out.println(edge.getDestWeightString());
            System.out.println();
        }
        
        // Prints path for all vertices in the graph.
        if (graph.getVertices().size() > 1) {
            for(Node target : graph.getVertices()) {
                if(source.equals(target)){
                    System.out.println("Source and target are same. i.e., " + target.toString() + ".\n");
                }
                else{
                    try {
                        LinkedList<Node> path = algorithm.getPath(target);
                        System.out.println("Shortest path to target(" + target.toString() + ") : \n");
                        for (Node node : path) {
                            System.out.println(node);
                        }
                        System.out.println();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } else {
            System.out.println("Not enough vertices to compute a path.");
        }
    }
}
