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

After you save that code to a file named _Hello.scala_, you can compile with <code>scalac</code>:

```
$ scalac Hello.scala
```

If you're comming to to Scala from Java, <code>scalac</code> is just like <code>javac</code>, and that command creates two files:

```
$ scala Hello
```

## The Scala REPL

The Scala REPL("Read Evaluate-Print-Loop") is a command-line interpreter that you use a "playground" are to test your Scala code. We introduce it early here so you can use it with the code examples that follow.

To start a REPL session, just type <code>scala</code> at your operating sytem command line, and you'll see something like this:

```
$ scala
Welcome to Scala 2.13.0 (Java HotSpot(TM))

scala> 
```

## Two types of variables

Scala has two types of variables:

- <code>val</code> is an immutable variable «like <code>final</code> in Java» and should be preferred.
- <code>var</code> creates a mutables variables, and should only be used when there is a specific reason to use it
- Examples:

```
val x = 1 	//immutable
var y = 9 	//mutable
```

## Declaring variable type

In Scala, you typically create variables without declaring their type:

```
val x = 1
val s = "a string"
val p = new Person("Regina")
```

When you do this, Scala can usually infer the data type for you, as shown in these REPL examples:

```
scala> val = 1
val x: Int = 1

scala> val s = "a string"
val s: String = a string
```

This feature is known as type inference, and it's a great way to help keep your code concise. You can also _explicity_ declare a variable's type, but that's not usually necessary:

```
val x: Int = 1
val s: String = "a string"
val p: Person = new Person("Regina")
```

As you can see, that code looks unnessarily verbose.

## Control structures

Here's a quick tour of Scala's control structures.

**if/else**

Scala's if/else control structed is similar to other languages:

```
if (test1){
    doA()
} else if (test2) {
    doB()
} else if (test2) {
    doC()
} else {
    doD()
}
```

However, unlike Java and many other languages, hte if/else construct returns a value, so, among other things, you can use it as ternary operator:

```
val x = if (a < b) a else b
```

**match expressions**
