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

Scala has a <code>match</code> expression, which its most basic use is like a Java <code>switch</code> statement:

```
val result = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
}
```

The <code>match</code> expression isn't limited to just integers, it can be used with any data type, include booleans:

```
val booleanAsString = bool match {
    case true => "true"
    case false => "false"
}
```

Here's an examples of <code>match</code> being used as the body of a method, and matching against many different types:

```
def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: float => "Float"
    case p: Person => "Person"
    case _ => "Unknown"
}
```

Powerful match expression are a big feature of Scala, and we share more examples of it later in this book.

**try/catch**

Scala's try/catch control structure lets you catch exceptions. It's similar to Java, but its syntax is consistent with match expressions:

```
try {
    writeToFile(text)
} catch {
    case fnfe: FileNotFoundException => println(fnfe)
    case ioe: IOException => println(ioe)
}
```

**for loops and expressions**

Scala <code>for</code> loops - which we generally write in this book as for-loops - look like this:

```
for (arg <- args) println(args)

//"x to y" sytax
for (i <- 0 to 5) println(i)

//"x to y" syntax
for (i <- 0 to 5 by 2) println(i)
```

You can also add the <code>yield</code> keyword to for-loops to create _for-examples_ that yield a result. Here's a _for-expression_ that doubles each value in the sequence 1 to 5:

```
val x = for (i <- 1 to 5) yield i * 2
```

Here's another _for-expression_ that iterates over a list of strings:

```
val fruits = List("apple", "banana", "lime", "orange")

val fruitLengths = for {
    f <- fruit
    if f.length > 4
} yield f.length
```

Because Scala code generally just makes sense, we'll imagine that you can guess how this code works, even if you've never seen a for-expression or Scala list until now.

**while and do/while**

Scala also has <code>while</code> and <code>do</code>/<code>while</code> loops. Here's their general syntax:

```
//while loop
while(condition){
    statement(a)
    statement(b)
}

//do-while
do {
    statement(a)
    statement(b)
}
while(condition)
```

### Classes

Here's an example of a Scala class:

```
class Person(var firstName: String, var lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
}
```

This is how you use that class:

```
val p = new Person("Julia", "Kern")
println(p.firstName)
p.lastName="Manes"
p.printFullName()
```

Notice that there's no need to create "get" and "set" methods to access the fields in the class.

As a more complicated example, here's a <code>Pizza</code> class that you'll see later in the book:

```
clase Pizza (
    var crustSize: CrustSize,
    var crustType: CrusType,
    val topping: ArrayBuffer[Topping]
) {
    def addTopping(t: Topping): Unit = topping += t
    def removeTopping(t: Topping): Unit
}
```

In that code, an <code>ArrayBuffer</code> is like Java's <code>ArrayList</code>. The <code>CrustSize</code>, <code>CrustType</code>, and <code>Topping</code> classes aren't shown, but you can probably understand how that code works without needing to see those classes.

## Scala methods

Just like other OOP languages, Scala classes have methods, and this is what the Scala method syntax looks like:

```
def sum(a: Int, b: Int): Int = a + b
def concatenate(s1: String, s2: String): String = s1 + s2
```

You don't have to declare a method's return type, so it's perfectly legal to write those two methods like this, if you prefer:

```
def sum(a: Int, b: Int) = a + b
def concatenate(s1: String, s2: String): s1 + s2
``` 

This is how you call those methods:

```
val x = sum(1, 2)
val y = concatenate("foo", "bar")
```

## Traits

Traits is Scala are a lot of fun, and they also let you break your code down into small, modular units. To demostrate traits, here's an example from later in the book. Given these three traits:

```
traits Speaker {
    def speak(): String		// has no body, so it's abstract
}

trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")

trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped runnin")
}
```

You can create a <code>Dog</code> class that extends all of those traits while providing behavior for the <code>speak</code>.

```
class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
}
```

Similary, here's <code>Cat</code> class that shows how to override multiple trait methods:

```
class Cat extends Speaker with TailWagger with Runner {
    def sepeak(): String = "Meow"  
    override def startRunning(): Unit = println("Yeah ..., I don't run")
    override def stopRunning(): Unit = println("No need to stop")
}
```

If that code makes sense -great, you're comfortable with traits! If not, don't worry, we explain it in detail later in the book.

### Collections classes

If you're comming to Scala from Java and you're ready to really jump in and learn Scala, It's possible to use the Java collection classes in Scala, and some people do so for several weeks or months while getting comfortable with Scala. But it's highly recommended that you learn the basic Scala collections classes — <code>List</code>, <code>ListBuffer</code>, <code>Vector</code>, <code>ArrayBuffer</code>, <code>Map</code> and <code>Set</code> — as soon as posible. A great benefit of the Scala collections classes is that they offer many powerful methods that you'll want to start using as soon as possible to simplify your code.

**Population lists**

There are times when it's helpful to create sample list that are populated with data, and Scala offers many ways to populate list. Here are just a few:

```
val nums = List.range(0, 10)
val nums = (1 to 10 by 2).toList
val letters = ('a' to 'f').toList
val letters = ('a' to 'f' by 2).toList
```

**Sequence methods**

While there are many sequential collection classes you can use —  
<code>Array</code>, <code>ArrayBuffer</code>, <code>Vector</code><code>List</code> class. Given these two lists:

```
val nums = (1 to 10).toList
val names = List("joel", "ed", "chris", "maurice")
```

This is the <code>foreach</code> method:

```
scala> names.foreach(println)
joel
ed
chris
maurice
```

Here's the <code>filter</code> method, followed by <code>foreach</code>:

```
scala> nums.filter(_ < 4).foreach(println)
1
2
3
```

Here are some examples of the <code>map</code> method:

```
scala> val doubles = nums.map(_ * 2)
doubles: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

scala> val capNames = names.map(_.capitalize)
capNames: List[String] = List(Joel, Ed, Chris, Maurice)

scala> val lessThanFive = nums.map(_ < 5)
lessThanFive: List[Boolean] = List(true, true, true, true, false, false, false, false, false, false)
```

If you're ready to see one of the most powerful collections methods, here's <code>foldLeft<code>:

```
scala> nums.foldLeft(0)(_ + _)
res0: Int = 55

scala> nums.foldLeft(1)(_ * _)
res1: Int = 3628800
```

### Tuples

Tuples let you put a heterogenous collection of elements in a little container. A tuple can contain between two and 22 values, and all of the values can have different types. For example, this is a tuple that holds three different types, an <code>Int</code>, a <code>Double</code>, and a <code>String</code>:

```
(11, 11.0, "Eleven")
```

This is known as <code>Tuples3</code>, because it contains three elements.

Tuples are convenient in many places, such as where you might use an ad-hoc class in other languages. For instance, you can return a tuple from a method instaed of returning a class.

```
def getAppInfo(): (String, BigDecimal, Long) = {
    // get the stock symbol, price, and volume
    ("APPI", BigDecimal(123.45), 1012023031)
}
```  

Then you can assign the result of the method to a variable:

```
val t = getAapInfo()
```
