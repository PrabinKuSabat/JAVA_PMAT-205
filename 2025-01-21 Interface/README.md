# ☕ Lab Session — January 21, 2025

**Topic:** Interfaces in Java

## Concepts Covered

- Defining an interface with `interface` keyword
- Implementing interfaces with `implements`
- A class implementing multiple interfaces
- Interface constants (implicitly `public static final`)
- Interface vs Abstract Class — when to use which
- Default methods in interfaces (Java 8+)
- Functional interfaces and lambda basics
- Interface as a type — programming to an interface

## Key Takeaway

Interfaces define a **contract** — what a class must do, without dictating how. Unlike abstract classes, a Java class can implement **multiple interfaces**, enabling flexible, composable design.

```java
interface Drawable {
    void draw();  // implicitly public abstract
}

interface Resizable {
    void resize(double factor);
}

class Circle implements Drawable, Resizable {
    public void draw() { System.out.println("Drawing circle"); }
    public void resize(double factor) { /* ... */ }
}
```

## How to Run

```bash
javac *.java
java Main
```
