package main.Graph.Elements;

import main.Graph.Elements.Node;
import main.utils.Validator;

/**
 * The Edge class represents an edge in a graph. It connects two nodes 
 * (source and destination) and has a weight associated with it.
 */
public class Edge {
    /** The unique identifier for the edge */
    private String id;

    /** The source node of the edge */
    private Node source = null;

    /** The destination node of the edge */
    private Node destination = null;

    /** The weight of the edge, default value is a very high number */
    private Integer weight = Integer.MAX_VALUE;

    /**
     * Constructs an Edge with a specific id, source, destination, and weight.
     *
     * @param id          The unique identifier of the edge.
     * @param source      The source node of the edge.
     * @param destination The destination node of the edge.
     * @param weight      The weight of the edge.
     */
    public Edge(String id, Node source, Node destination, int weight) {
        if(source == null || destination == null){
            throw new IllegalArgumentException("Null Arguments provided to Edge constructor.");
        }
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * Default constructor that initializes the edge with user input
     * for id and weight, and creates new Node objects for source and destination.
     */
    public Edge() {
        this(Validator.getString("Please enter the Edge id: "), new Node(),
             new Node(), Validator.getInt("Please enter the Edge weight: "));
    }

    /**
     * Gets the id of the edge.
     *
     * @return The unique identifier of the edge.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the source node of the edge.
     *
     * @return The source node.
     */
    public Node getSource() {
        return this.source;
    }

    /**
     * Gets the destination node of the edge.
     *
     * @return The destination node.
     */
    public Node getDestination() {
        return this.destination;
    }

    /**
     * Gets the weight of the edge.
     *
     * @return The weight of the edge.
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Updates the id of the edge by prompting the user for a new id.
     */
    public void updateId() {
        this.id = Validator.getString("Please enter the new id: ");
    }

    /**
     * Updates the source node of the edge by invoking the update method on the source node.
     */
    public void updateSource() {
        source.update();
    }

    /**
     * Updates the destination node of the edge by invoking the update method on the destination node.
     */
    public void updateDestination() {
        destination.update();
    }

    /**
     * Updates the weight of the edge by prompting the user for a new weight.
     */
    public void updateWeight() {
        do{
            this.weight = Validator.getInt("Please enter the new Weight: ");
        }while( weight <= 0 );        
    }

    /**
     * Returns a string representation of the edge, including its id, source, destination, and weight.
     *
     * @return A formatted string representing the edge.
     */
    @Override
    public String toString() {
        return "Id: " + id + "\n    " + "Source: " + source.toString() + "\n   "
                + "Destination: " + destination.toString() + "\n"
                + "Weight: " + weight;
    }
}
