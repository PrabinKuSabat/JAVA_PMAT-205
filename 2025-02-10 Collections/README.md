# ☕ Lab Session — February 10, 2025

**Topic:** Java Collections Framework

## Concepts Covered

- The `Collection` interface hierarchy
- `ArrayList` — dynamic arrays, `add()`, `remove()`, `get()`, `size()`
- `LinkedList` — doubly-linked list, use as Queue/Deque
- `HashSet` — unordered, no duplicates
- `TreeSet` — sorted set
- `HashMap<K, V>` — key-value pairs, `put()`, `get()`, `containsKey()`
- `TreeMap` — sorted map by keys
- Iterating collections: `for-each`, `Iterator`, `forEach()` with lambda
- `Collections` utility class: `sort()`, `reverse()`, `shuffle()`, `min()`, `max()`
- Generics with collections: `List<String>`, `Map<String, Integer>`

## Collections at a Glance

| Collection | Order | Duplicates | Null | Use When |
|------------|-------|-----------|------|----------|
| `ArrayList` | Insertion | Yes | Yes | Fast random access |
| `LinkedList` | Insertion | Yes | Yes | Fast insert/delete |
| `HashSet` | None | No | One | Unique elements |
| `TreeSet` | Sorted | No | No | Sorted unique elements |
| `HashMap` | None | Keys: No | Yes | Key-value lookup |
| `TreeMap` | Sorted | Keys: No | No | Sorted key-value |

## How to Run

```bash
javac *.java && java Main
```
