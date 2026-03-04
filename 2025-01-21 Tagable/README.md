# ☕ Lab Session — January 21, 2025

**Topic:** Taggable / Marker Interface Pattern

## Concepts Covered

- What a **marker (taggable) interface** is — an interface with no methods
- Built-in Java marker interfaces: `Serializable`, `Cloneable`, `RandomAccess`
- Using `instanceof` to check if an object has been "tagged"
- Why marker interfaces exist vs annotation-based alternatives
- Practical use-case: tagging objects for special runtime behavior

## Key Takeaway

A **marker interface** is an empty interface used purely to *mark* a class as having a certain property or capability. The JVM and frameworks use `instanceof` checks to apply special behavior to marked classes.

```java
interface Taggable { }  // marker — no methods

class Document implements Taggable {
    String content;
}

// Check at runtime:
if (obj instanceof Taggable) {
    System.out.println("This object is tagged!");
}
```

## How to Run

```bash
javac *.java
java Main
```
