# ☕ Lab Session — February 6, 2025 (Part 2)

**Topic:** Custom Exceptions & Exception Chaining

## Concepts Covered

- Creating **custom exception classes** by extending `Exception` or `RuntimeException`
- Adding custom fields and constructors to exceptions
- Exception chaining — wrapping one exception inside another with `initCause()` or constructor
- `try-with-resources` statement (Java 7+) for automatic resource management
- The `AutoCloseable` interface
- Re-throwing exceptions
- Best practices: when to create custom exceptions, meaningful exception messages

## Key Takeaway

Custom exceptions make your code **self-documenting**. Instead of a generic `Exception`, throw an `InsufficientFundsException` — it immediately communicates what went wrong.

```java
public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient funds. Short by: " + amount);
        this.amount = amount;
    }

    public double getAmount() { return amount; }
}
```

## How to Run

```bash
javac *.java && java Main
```
