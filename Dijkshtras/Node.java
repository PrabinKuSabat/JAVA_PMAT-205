package main.Graph.Elements;

import main.utils.*;

/**
 * The Node class represents a node (vertex) in a graph. Each node has an id and a name.
 */
public class Node {
    /** The unique identifier for the node */
    private String id;

    /** The name of the node */
    private String name;

    /**
     * Constructs a node with a specific id and name.
     *
     * @param id   The unique identifier for the node.
     * @param name The name of the node.
     */
    public Node(String id, String name) {
        if( id == null || name == null){
            throw new IllegalArgumentException("Null arguments provided to Node constructor.");
        }
        this.id = id;
        this.name = name;
    }

    /**
     * Default constructor that initializes the node with user input for id and name.
     */
    public Node() {
        this(Validator.getString("Please enter the node ID: "), 
             Validator.getString("Please enter the node Name: "));
    }

    /**
     * Overrides the hashCode method from the Object class to generate a hash code for the node.
     * 
     * @return The hash code generated from the node's id and name.
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name);
    }

    /**
     * Overrides the equals method from the Object class to check if two nodes are equal.
     *
     * @param obj The object to compare with.
     * @return True if the nodes have the same id and name, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Node n = (Node) obj;
        return id.equals(n.id) && name.equals(n.name);
    }

    /**
     * Gets the id of the node.
     *
     * @return The unique identifier of the node.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the name of the node.
     *
     * @return The name of the node.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Updates both the id and name of the node by prompting the user for input.
     */
    public void update() {
        updateId();
        updateName();
    }

    /**
     * Updates the id of the node by prompting the user for a new id.
     */
    public void updateId() {
        this.id = Validator.getString("Please enter the new id: ");
    }

    /**
     * Updates the name of the node by prompting the user for a new name.
     */
    public void updateName() {
        this.name = Validator.getString("Please enter the new name: ");
    }

    /**
     * Returns a string representation of the node, including its id and name.
     *
     * @return A formatted string representing the node.
     */
    @Override
    public String toString() {
        return "Id: " + id + "\n" + "Name: " + name;
    }
}
