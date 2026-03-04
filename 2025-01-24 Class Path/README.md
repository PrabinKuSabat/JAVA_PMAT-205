# ☕ Lab Session — January 24, 2025

**Topic:** Java CLASSPATH

## Concepts Covered

- What the CLASSPATH is and why it exists
- Setting CLASSPATH via environment variable vs `-cp` flag
- Compiling and running programs with custom classpaths
- Including external `.jar` files in the classpath
- Classpath with multiple directories and JARs (`:` on Unix, `;` on Windows)
- Common `ClassNotFoundException` and how CLASSPATH causes it
- The `.` (current directory) in classpath

## Key Takeaway

The **CLASSPATH** tells the JVM **where to look** for compiled `.class` files and `.jar` libraries. Getting it right is essential for multi-file projects and using external dependencies.

```bash
# Compile with external jar
javac -cp ".:lib/mylib.jar" Main.java

# Run with classpath
java -cp ".:lib/mylib.jar" Main
```

## How to Run

```bash
javac -cp "." *.java
java -cp "." Main
```
