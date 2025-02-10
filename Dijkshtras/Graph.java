package main.Graph;

import java.util.LinkedList;
import java.util.ListIterator;

import main.Graph.Elements.*;
import main.utils.Validator;

/**
 * The Graph class represents a graph data structure consisting of vertices (nodes) and edges.
 * It supports adding vertices and edges, and printing the graph's components.
 */
public class Graph {
    /** A list of vertices (nodes) in the graph */
    private LinkedList<Node> vertices;

    /** A list of edges connecting the vertices in the graph */
    private LinkedList<Edge> edges;

    /**
     * Constructs a graph with the given vertices and edges.
     *
     * @param vertices The list of vertices in the graph.
     * @param edges    The list of edges in the graph.
     */
    public Graph(LinkedList<Node> vertices, LinkedList<Edge> edges) {
        if(vertices == null || edges == null ){
            throw new IllegalArgumentException("Null arguments provided to Graph constructor.");
        }
        this.vertices = vertices;
        this.edges = edges;
    }

    /**
     * Default constructor that allows the user to add vertices and edges interactively.
     */
    public Graph() {
        this.vertices = new LinkedList<>();
        this.edges = new LinkedList<>();
        do {
            addVertex();
        } while (Validator.getString("Do you want to continue? (y/N)").equalsIgnoreCase("y"));

        do {
            try {
                addEdge();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } while (Validator.getString("Do you want to continue? (y/N)").equalsIgnoreCase("y"));
    }

    /**
     * Adds a new vertex (node) to the graph.
     */
    public void addVertex() {
        try {
            this.vertices.add(new Node());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a new edge to the graph.
     */
    public void addEdge() {
        Edge edgeToAdd = null;
        String id;
        Node source = null;
        boolean done = false;
        Node destination = null;
        int weight;
        do{
            if(done == true){
                System.out.println("Edge already exists. \n Re-enter again.");
            }
            else{
                // Check if the id already exists in the graph
                do {
                    id = Validator.getString("Please enter the Edge id: ");
                    boolean idExists = false;

                    // Loop through the list of edges to check for duplicate ids
                    for (Edge e : edges) {
                        if (e.getId().equals(id)) {
                            System.out.println("An edge with this id already exists. \n Please enter a new id.");
                            idExists = true;
                            break;
                        }
                    }

                    // Continue prompting for a new id if one already exists
                    if (!idExists) {
                        break;
                    }
                } while (true);
                do{
                    do{
                        System.out.println("Source: ");
                        source = new Node();
                    }while(!vertices.contains(source));
                    do{
                        System.out.println("Destination: ");
                        destination = new Node();
                    }while(!vertices.contains(destination));
                    boolean connectionExists = false;

                    // Loop through the list of edges to check for duplicate ids
                    for (Edge e : edges) {
                        if (e.getSource().equals(source) && e.getDestination().equals(destination)) {
                            System.out.println("An edge with same connection already exists. \n Please make a new connection.");
                            connectionExists = true;
                            break;
                        }
                    }

                    // Continue prompting for a new id if one already exists
                    if (!connectionExists) {
                        break;
                    }
                }while(true);
                    do{
                    weight = Validator.getInt("Please enter the edge weight: ");
                }while(weight <= 0);
                try {
                    edgeToAdd = new Edge(id,source,destination,weight);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            done = true;
        }while(edges.contains(edgeToAdd));
        if(edgeToAdd == null){
            throw new NullPointerException("New edge has not been created in addEdge.");
        }
        this.edges.add(edgeToAdd);
    }

    /**
     * Prints both the vertices and edges of the graph.
     */
    public void print() {
        printVertices();
        System.out.println("\n\n");
        printEdges();
    }

    /**
     * Prints the vertices of the graph.
     */
    public void printVertices() {
        ListIterator<Node> verticIterator = vertices.listIterator();

        while (verticIterator.hasNext()) {
            System.out.println(verticIterator.next());
        }
    }

    /**
     * Prints the edges of the graph.
     */
    public void printEdges() {
        ListIterator<Edge> edgIterator = edges.listIterator();

        while (edgIterator.hasNext()) {
            System.out.println(edgIterator.next());
        }
    }

    /**
     * Gets the list of vertices in the graph.
     *
     * @return A list of vertices (nodes).
     */
    public LinkedList<Node> getVertices() {
        return vertices;
    }

    /**
     * Gets the list of edges in the graph.
     *
     * @return A list of edges.
     */
    public LinkedList<Edge> getEdges() {
        return edges;
    }

    /**
     * Returns a string representation of the graph, including its vertices and edges.
     *
     * @return A string representation of the graph.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices:\n");
        for (Node v : vertices) {
            sb.append(v).append("\n");
        }
        sb.append("Edges:\n");
        for (Edge e : edges) {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }
}
