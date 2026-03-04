# ☕ Lab Session — December 18, 2024

**Topic:** OOP Fundamentals — Encapsulation & Constructors

## Concepts Covered

- Encapsulation in depth — hiding internal state
- Constructor chaining with `this()`
- Static fields and static methods
- `static` vs instance context
- Introduction to Object class methods: `toString()`, `equals()`
- Passing objects as method parameters
- Arrays of objects

## Key Takeaway

**Encapsulation** is the first pillar of OOP — keep fields `private`, expose only what's necessary through controlled `public` methods. This protects the integrity of your objects.

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() { return balance; }
}
```

## How to Run

```bash
javac *.java
java MainClass
```
