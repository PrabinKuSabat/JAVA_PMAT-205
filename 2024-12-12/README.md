# ☕ Lab Session — December 12, 2024

**Topic:** Core Java — Classes, Objects & Methods

## Concepts Covered

- Defining classes and creating objects
- Instance variables (fields) and methods
- Constructors — default and parameterized
- `this` keyword
- Method overloading
- Access modifiers: `public`, `private`, `protected`, default
- Getters and setters (encapsulation basics)

## Key Takeaway

Everything in Java is an **object**. A class is the blueprint; an object is the instance created from that blueprint.

```java
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
}
```

## How to Run

```bash
javac *.java
java MainClass
```
