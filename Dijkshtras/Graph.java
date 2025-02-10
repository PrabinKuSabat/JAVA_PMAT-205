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
            addEdge();
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
        Node source;
        String id = Validator.getString("Please enter the Edge id: ");
        do{
            source = new Node();
        }while(!vertices.contains(source));
        Node destination;
        do{
            destination = new Node();
        }while(!vertices.contains(destination));
        int weight;
        do{
         weight = Validator.getInt("Please enter the edge weight: ");
        }while(weight <= 0);
        try {
            this.edges.add(new Edge());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints both the vertices and edges of the graph.
     */
    public void print() {
        printVertices();
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
