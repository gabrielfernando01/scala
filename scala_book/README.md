![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/scala_book/image/header.png)

# PRELUDE: A TASTE OF SCALA

### Overview

Before we jump into the examples, here are a few important things to know about Scala:

- It's high-level language
- It's statically typed
- It's syntax is concise but still readable - we calll it expressive
- It supports the object-oriented programming (OOP) paradigm
- It supports the funtional programming (FP) paradigm
- It has a sophisticated type inference system
- Scala code results in _class_ file that run on the Java Virtual Machine (JVM)
- It's easy to use Java in Scala

## Hello, world

Ever since the book, _C Programming Language_ it's been a tridiion to begin programming book with a "Hello, world" example, and not to disappoint, this is one way to write that example in Scala:

```
object Hello extends App {
    println("Hello world")
}
```

