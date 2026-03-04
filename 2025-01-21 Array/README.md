# ☕ Lab Session — January 21, 2025

**Topic:** Arrays in Java

## Concepts Covered

- 1D arrays — declaration, initialization, traversal
- 2D arrays (matrices) — row/column access
- Enhanced `for-each` loop with arrays
- `Arrays` utility class — `sort()`, `copyOf()`, `fill()`, `binarySearch()`
- Passing arrays to methods
- Variable-length arguments (varargs): `int... nums`
- Array of objects
- Common patterns: linear search, bubble sort

## Key Takeaway

Arrays in Java are **fixed-size** and **zero-indexed**. For dynamic sizing, use `ArrayList` from the Collections framework (covered later).

```java
int[] scores = {85, 92, 78, 95, 88};
Arrays.sort(scores);
System.out.println(Arrays.toString(scores));
// Output: [78, 85, 88, 92, 95]
```

## How to Run

```bash
javac *.java
java Main
```
