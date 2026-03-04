# ☕ Lab Session — December 10, 2024

**Topic:** Introduction to Java — Basics & Environment Setup

## Concepts Covered

- What Java is and how the JVM works
- Setting up the JDK and running the first program
- Java program structure — `class`, `main` method, `System.out.println`
- Primitive data types: `int`, `double`, `boolean`, `char`
- Variables, constants (`final`), and type casting
- Basic operators: arithmetic, relational, logical
- Reading input with `Scanner`

## Key Takeaway

Java follows **Write Once, Run Anywhere (WORA)** — source code compiles to bytecode that runs on any machine with a JVM installed.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## How to Run

```bash
javac HelloWorld.java
java HelloWorld
```
