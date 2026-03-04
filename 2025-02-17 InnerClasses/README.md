# ☕ Lab Session — February 17, 2025

**Topic:** Inner & Nested Classes

## Concepts Covered

- **Member Inner Class** — non-static class inside another class, has access to outer instance
- **Static Nested Class** — static class inside another, no access to outer instance
- **Local Class** — class defined inside a method
- **Anonymous Class** — nameless class defined and instantiated in one expression
- Accessing outer class members from an inner class
- When to use each type
- Anonymous classes as a precursor to lambda expressions

## Types at a Glance

| Type | Static? | Access Outer? | Common Use |
|------|---------|--------------|------------|
| Member inner class | No | Yes | Logical grouping, helper class |
| Static nested class | Yes | No (static only) | Builder pattern, utility |
| Local class | No | Yes (effectively final vars) | One-off logic in method |
| Anonymous class | No | Yes | Interface implementations, callbacks |

## Key Takeaway

**Anonymous classes** are the classic Java pattern for one-off interface/abstract class implementations — largely replaced by **lambda expressions** in Java 8+, but important to understand.

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running anonymously!");
    }
};
new Thread(r).start();
```

## How to Run

```bash
javac *.java && java Main
```
