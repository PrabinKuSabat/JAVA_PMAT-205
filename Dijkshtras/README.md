# 📊 Dijkstra's Algorithm — Java Implementation

A Java implementation of **Dijkstra's Shortest Path Algorithm** — one of the most fundamental graph algorithms in computer science.

## What Is Dijkstra's Algorithm?

Dijkstra's algorithm finds the **shortest path** from a source vertex to all other vertices in a weighted graph with non-negative edge weights. It uses a **greedy approach** with a priority queue.

## Algorithm Steps

```
1. Initialize distances: source = 0, all others = ∞
2. Add source to a Min Priority Queue
3. While queue is not empty:
   a. Extract vertex u with minimum distance
   b. For each neighbor v of u:
      - If dist[u] + weight(u,v) < dist[v]:
        Update dist[v] and add v to queue
4. Result: dist[] contains shortest distances from source
```

## Time Complexity

| Implementation | Time Complexity |
|----------------|----------------|
| With adjacency matrix | O(V²) |
| With binary heap (PriorityQueue) | O((V + E) log V) |

## Key Java Concepts Used

- `PriorityQueue` with a custom `Comparator`
- Adjacency list representation using `List<List<int[]>>`
- `int[]` arrays for storing `[vertex, weight]` pairs
- Graph traversal logic

## How to Run

```bash
javac Dijkshtras.java
java Dijkshtras
```

> 💡 Dijkstra's algorithm is used in GPS navigation, network routing (OSPF protocol), and game AI pathfinding. Understanding it is essential for any Java developer.
