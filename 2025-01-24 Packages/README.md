# ☕ Lab Session — January 24, 2025

**Topic:** Packages & Access Modifiers

## Concepts Covered

- Declaring a package with `package` statement
- Package naming conventions (reverse domain: `com.prabin.utils`)
- Compiling into a package directory structure with `javac -d`
- `import` statement — single class vs wildcard import
- Built-in Java packages: `java.lang`, `java.util`, `java.io`
- Access modifier scope across packages:

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|-----------|--------------|----------|---------------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

## Key Takeaway

Packages are Java's **namespace system** — they prevent naming conflicts and control visibility across large codebases.

## How to Run

```bash
javac -d . *.java
java com.prabin.Main
```
