# 📂 Classpath Directory

A demonstration directory used alongside the **CLASSPATH** lab session (`2025-01-24 Class Path/`). This folder illustrates how the JVM resolves classes when a custom classpath points to a specific directory.

## Purpose

When you run:

```bash
javac -d Classpath\ directory/ MyClass.java
java -cp "Classpath directory/" MyClass
```

The compiled `.class` files are placed here, and the JVM is told to look in this directory when searching for classes.

## Key Concept

The `-d` flag in `javac` specifies the **destination directory** for compiled class files. The directory structure is automatically created to match the package hierarchy:

```
Classpath directory/
└── com/
    └── prabin/
        └── MyClass.class
```

> 💡 This folder exists to make the classpath concept tangible — you can see exactly where classes land and understand why the JVM needs to know where to look.
