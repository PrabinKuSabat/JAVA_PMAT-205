# ☕ Lab Session — March 5, 2025 (Part 1)

**Topic:** I/O Streams — Byte Streams

## Concepts Covered

- The Java I/O stream model — input vs output, byte vs character
- **Byte Streams** (`InputStream` / `OutputStream` hierarchy)
- `FileInputStream` — reading bytes from a file
- `FileOutputStream` — writing bytes to a file
- `BufferedInputStream` / `BufferedOutputStream` — buffering for performance
- `DataInputStream` / `DataOutputStream` — reading/writing primitive types
- Copying a file byte-by-byte
- Always closing streams — `try-with-resources`

## Stream Hierarchy (Byte)

```
InputStream
├── FileInputStream
├── BufferedInputStream
└── DataInputStream

OutputStream
├── FileOutputStream
├── BufferedOutputStream
└── DataOutputStream
```

## Key Takeaway

Byte streams read/write data **one byte at a time**. Use them for binary files (images, audio). Always wrap with a `BufferedInputStream` for performance.

```java
try (FileInputStream in = new FileInputStream("input.txt");
     FileOutputStream out = new FileOutputStream("output.txt")) {
    int b;
    while ((b = in.read()) != -1) {
        out.write(b);
    }
}
```

## How to Run

```bash
javac *.java && java Main
```
