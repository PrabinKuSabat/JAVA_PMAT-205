# ☕ Lab Session — February 6, 2025

**Topic:** Exception Handling in Java

## Concepts Covered

- What exceptions are and the exception hierarchy
- `try`, `catch`, `finally` blocks
- Catching multiple exceptions (multi-catch: `catch (A | B e)`)
- `throw` — explicitly throwing an exception
- `throws` — declaring checked exceptions in method signature
- Checked vs Unchecked exceptions
- Common built-in exceptions: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `NumberFormatException`, `IOException`
- `finally` always executes — used for resource cleanup

## Exception Hierarchy

```
Throwable
├── Error            (JVM-level, don't catch)
└── Exception
    ├── IOException      (checked)
    └── RuntimeException (unchecked)
        ├── NullPointerException
        └── ArithmeticException
```

## Key Takeaway

**Checked exceptions** must be handled or declared. **Unchecked exceptions** (RuntimeException subclasses) indicate programming errors and don't need to be declared.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
} finally {
    System.out.println("Always runs.");
}
```

## How to Run

```bash
javac *.java && java Main
```
