# ☕ Lab Session — March 5, 2025 (Part 2)

**Topic:** I/O Streams — Character Streams & Buffering

## Concepts Covered

- **Character Streams** (`Reader` / `Writer` hierarchy) — handle Unicode text
- `FileReader` / `FileWriter` — reading and writing text files
- `BufferedReader` — `readLine()` for efficient line-by-line reading
- `BufferedWriter` — `write()` + `newLine()` for text output
- `PrintWriter` — `println()` convenience for text output
- `InputStreamReader` / `OutputStreamWriter` — bridge between byte and character streams
- Reading from `System.in` via `BufferedReader`
- Byte Streams vs Character Streams: which to use when

## Key Takeaway

Character streams automatically handle **character encoding** (UTF-8, etc.). Always use them for **text data**; use byte streams for binary data.

```java
try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
}
```

## Byte vs Character Streams

| | Byte Streams | Character Streams |
|---|---|---|
| Base classes | `InputStream` / `OutputStream` | `Reader` / `Writer` |
| Unit | 1 byte (8-bit) | 1 char (16-bit Unicode) |
| Best for | Binary files | Text files |

## How to Run

```bash
javac *.java && java Main
```
