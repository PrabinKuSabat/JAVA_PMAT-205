# ☕ Lab Session — January 16, 2025

**Topic:** Inheritance & Polymorphism

## Concepts Covered

- `extends` keyword — single inheritance in Java
- `super` keyword — accessing parent class constructor and methods
- Method overriding (`@Override`)
- Runtime polymorphism — dynamic method dispatch
- `instanceof` operator
- Abstract classes and abstract methods
- The `final` keyword on classes and methods

## Key Takeaway

**Inheritance** lets a child class reuse and extend parent class behavior. **Polymorphism** lets you treat objects of different subclasses through a common parent type, and the correct method is selected at runtime.

```java
class Animal {
    public void speak() { System.out.println("..."); }
}

class Dog extends Animal {
    @Override
    public void speak() { System.out.println("Woof!"); }
}

Animal a = new Dog();
a.speak(); // Outputs: Woof!
```

## How to Run

```bash
javac *.java
java Main
```
