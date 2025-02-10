package main.Algorithms;

import main.Graph.*;
import main.Graph.Elements.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of Dijkstra's algorithm for finding the shortest path in a graph.
 *
 * <p>
 * This class uses a {@link Graph} and computes the shortest path from a given source node
 * to all other nodes in the graph. The algorithm maintains:
 * <ul>
 *   <li>A set of settled nodes</li>
 *   <li>A set of unsettled nodes</li>
 *   <li>A map of predecessors</li>
 *   <li>A map of distances</li>
 * </ul>
 * Only two methods are public:
 * <ul>
 *   <li>{@link #execute(Node)}: Computes shortest paths from the source node.</li>
 *   <li>{@link #getPath(Node)}: Returns the shortest path from the source to the target node.</li>
 * </ul>
 * All helper methods are private.
 * </p>
 */
public class DijkstraAlgorithm {

    private final Graph graph;
    private final Set<Node> settledNodes;
    private final Set<Node> unsettledNodes;
    private final Map<Node, Integer> distances;
    private final Map<Node, Node> predecessors;
    private static final int INFINITY = Integer.MAX_VALUE;

    /**
     * Constructs a new DijkstraAlgorithm instance with the specified graph.
     *
     * @param graph the graph on which the algorithm will be executed
     * @throws IllegalArgumentException if the provided graph is null
     */
    public DijkstraAlgorithm (Graph graph) {
        if (graph == null) {
            throw new IllegalArgumentException("Graph cannot be null.");
        }
        this.graph = graph;
        this.settledNodes = new HashSet<>();
        this.unsettledNodes = new HashSet<>();
        this.distances = new HashMap<>();
        this.predecessors = new HashMap<>();
    }

    /**
     * Executes Dijkstra's algorithm from the specified source node.
     *
     * <p>
     * This method computes the shortest paths from the source node to all other nodes in the graph.
     * </p>
     *
     * @param source the source node from which to compute shortest paths
     * @throws IllegalArgumentException if the source node is null
     */
    public void execute (Node source) throws IllegalArgumentException {
        if (source == null) {
            throw new IllegalArgumentException("Source node cannot be null.");
        }
        // Initialize all nodes with infinite distance; set source distance to 0.
        for (Node node : graph.getVertices()) {
            distances.put(node, INFINITY);
        }
        distances.put(source, 0);
        unsettledNodes.add(source);

        // Process nodes until there are no unsettled nodes left.
        while (!unsettledNodes.isEmpty()) {
            Node evaluationNode = getNodeWithLowestDistance(unsettledNodes);
            unsettledNodes.remove(evaluationNode);
            settledNodes.add(evaluationNode);
            evaluateNeighbours(evaluationNode);
        }
    }

    /**
     * Returns the shortest path from the source node (as defined in {@link #execute(Node)})
     * to the specified target node.
     *
     * @param target the target node for which to retrieve the path
     * @return a LinkedList of nodes representing the shortest path from the source to the target node
     * @throws RuntimeException if no path exists from the source to the target node
     */
    public LinkedList<Node> getPath(Node target) throws RuntimeException {
        LinkedList<Node> path = new LinkedList<>();
        if (!predecessors.containsKey(target) && distances.get(target) == INFINITY) {
            throw new RuntimeException("No path exists from source to target.");
        }
        Node step = target;
        path.addFirst(step);
        while (predecessors.containsKey(step)) {
            step = predecessors.get(step);
            path.addFirst(step);
        }
        return path;
    }


    /**
     * Finds and returns the node with the lowest distance in the given set of unsettled nodes.
     *
     * @param nodes the set of unsettled nodes
     * @return the node with the lowest recorded distance
     */
    private Node getNodeWithLowestDistance(Set<Node> nodes) {
        Node lowestNode = null;
        int lowestDistance = INFINITY;
        for (Node node : nodes) {
            int nodeDistance = getShortestDistance(node);
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestNode = node;
            }
        }
        return lowestNode;
    }

    /**
     * Evaluates the neighbors of the specified node and updates their distances and predecessors.
     *
     * @param node the node whose neighbors are to be evaluated
     */
    private void evaluateNeighbours(Node node) {
        // For each edge in the graph, if it originates from the current node, process the destination.
        for (Edge edge : graph.getEdges()) {
            if (edge.getSource().equals(node)) {
                Node destination = edge.getDestination();
                // Only evaluate if the destination is not settled.
                if (!settledNodes.contains(destination)) {
                    int edgeDistance = edge.getWeight();
                    int newDistance = getShortestDistance(node) + edgeDistance;
                    if (newDistance < getShortestDistance(destination)) {
                        distances.put(destination, newDistance);
                        predecessors.put(destination, node);
                        unsettledNodes.add(destination);
                    }
                }
            }
        }
    }

    /**
     * Returns the currently recorded shortest distance for the specified node.
     *
     * @param node the node for which to get the shortest distance
     * @return the shortest distance recorded for the node, or INFINITY if none exists
     */
    private int getShortestDistance(Node node) {
        Integer d = distances.get(node);
        return (d == null) ? INFINITY : d;
    }
}
