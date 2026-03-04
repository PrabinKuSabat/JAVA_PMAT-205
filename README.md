<div align="center">

# ☕ JAVA\_PMAT-205 — Java Programming Lab

> *Lab code, exercises, and assignments for the PMAT-205 Java Programming course.*

[![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk)](https://www.java.com)
[![Course](https://img.shields.io/badge/Course-PMAT--205-1d4ed8?style=for-the-badge)](https://github.com/PrabinKuSabat/JAVA_PMAT-205)
[![Author](https://img.shields.io/badge/Author-Prabin%20Kumar%20Sabat-7c3aed?style=for-the-badge)](https://prabins.vercel.app)

</div>

---

## 📖 About

This repository contains all Java lab session source code, exercises, and assignments for **PMAT-205 — Object-Oriented Programming with Java**. Each folder represents a specific lab session, named with the date and topic covered, forming a chronological learning path through core Java concepts.

---

## 🗂️ Topic Index

| Folder | Date | Topic |
|--------|------|-------|
| [`2024-12-10/`](./2024-12-10/) | Dec 10, 2024 | Introduction — Java Basics & Environment Setup |
| [`2024-12-12/`](./2024-12-12/) | Dec 12, 2024 | Core Java — Classes, Objects & Methods |
| [`2024-12-18/`](./2024-12-18/) | Dec 18, 2024 | OOP Fundamentals — Encapsulation & Constructors |
| [`2025-01-16 Inheritance/`](./2025-01-16%20Inheritance/) | Jan 16, 2025 | Inheritance & Polymorphism |
| [`2025-01-21 Array/`](./2025-01-21%20Array/) | Jan 21, 2025 | Arrays (1D, 2D, varargs) |
| [`2025-01-21 Interface/`](./2025-01-21%20Interface/) | Jan 21, 2025 | Interfaces & Abstract Classes |
| [`2025-01-21 Tagable/`](./2025-01-21%20Tagable/) | Jan 21, 2025 | Taggable/Marker Interface Pattern |
| [`2025-01-24 Class Path/`](./2025-01-24%20Class%20Path/) | Jan 24, 2025 | Java CLASSPATH |
| [`2025-01-24 Packages/`](./2025-01-24%20Packages/) | Jan 24, 2025 | Packages & Access Modifiers |
| [`2025-02-06 Exceptions/`](./2025-02-06%20Exceptions/) | Feb 6, 2025 | Exception Handling — try/catch/finally |
| [`2025-02-06 Exceptions 2/`](./2025-02-06%20Exceptions%202/) | Feb 6, 2025 | Custom Exceptions & Exception Chaining |
| [`2025-02-10 Collections/`](./2025-02-10%20Collections/) | Feb 10, 2025 | Java Collections Framework |
| [`2025-02-17 InnerClasses/`](./2025-02-17%20InnerClasses/) | Feb 17, 2025 | Inner, Static Nested & Anonymous Classes |
| [`2025-03-05 IO Streams 1/`](./2025-03-05%20IO%20Streams%201/) | Mar 5, 2025 | I/O Streams — Byte Streams |
| [`2025-03-05 IO Streams 2/`](./2025-03-05%20IO%20Streams%202/) | Mar 5, 2025 | I/O Streams — Character Streams & Buffering |
| [`2025-03-10 Networks/`](./2025-03-10%20Networks/) | Mar 10, 2025 | Java Networking — Sockets & Client-Server |
| [`Classpath directory/`](./Classpath%20directory/) | — | CLASSPATH demo directory structure |
| [`Dijkshtras/`](./Dijkshtras/) | — | Dijkstra's Shortest Path Algorithm |

---

## 🏗️ How to Run

All files are plain Java. Compile and run from the terminal:

```bash
# Compile
javac FileName.java

# Run
java FileName
```

For programs organized into packages:

```bash
# Compile into package structure
javac -d . FileName.java

# Run with fully qualified class name
java com.example.ClassName
```

For programs requiring a custom CLASSPATH:

```bash
javac -cp ".;lib/*" FileName.java
java -cp ".;lib/*" FileName
```

---

## 💻 Prerequisites

- **JDK 8+** — [Download from Oracle](https://www.oracle.com/java/technologies/downloads/) or use [OpenJDK](https://adoptium.net/)
- **IDE (optional but recommended):**
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/) — best for Java development
  - [Eclipse](https://www.eclipse.org/)
  - [VS Code](https://code.visualstudio.com/) with the [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

## 📈 Learning Progression

```
Basics & OOP (Dec 2024)
        ↓
Inheritance, Arrays, Interfaces, Packages (Jan 2025)
        ↓
Exceptions, Collections, Inner Classes (Feb 2025)
        ↓
I/O Streams, Networking (Mar 2025)
        ↓
Algorithms — Dijkstra's (Bonus)
```

---

## 👨‍💻 Author

**Prabin Kumar Sabat** · [prabins.vercel.app](https://prabins.vercel.app) · [GitHub @PrabinKuSabat](https://github.com/PrabinKuSabat)
