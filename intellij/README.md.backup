![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/idea.jpg)

## Getting started with scala in Intellij

### Creating the project

1. Open IntelliJ and click **File** => **New** => **Project**
2. On the left panel, select Scala. On the right panel select IDEA.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/new_project.png)

3. Assuming this is your first time creating a Scala project with IntelliJ, you'll need to install a Scala SDK. To the right of the Scala SDK field, click the **Create** botton.

### Writing code

1. Once the **Project** pane on the left, right-click <code>src</code> and select **New** >= **Scala class**. If you don't see **Scala class**
2. Name the class <code>Hello</code> and change the **Kind** to <code>object</code>.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/object.png)

3. Change the code in the file to the following:

```
object Hello extends App {
    println("Hello world")
}
```

### Running it

- Right cilck on <code>Hello</code> in your code and select **Run 'Hello'**
- You're done!

### Experimenting with Scala

A good way to try out code samples is with Scala Worksheets

1. In the project pane on the left, right click <code>src</code> and select **New** => **Scala Worksheet**.
2. Name your new Scala worksheet "Mathematician"
3. Enter the following code into the worksheet:

```
def square(x: Int): Int = x * x
square(3)
```

As you change your code, you'll notice that it gets evaluated in the right pane. If you do not see a right pane, right-click on your Scala worksheet in the Project pane, and click on Evaluate Worksheet.

### Next Steps

Now you know how to create a simple Scala project which can be used for starting to learn the language. In the next tutorial, we'll introduce an important build called sbt which can be used for simple projects and production apps.

## Building a scala project with IntelliJ and SBT

In this tutorial, we'll see how to build a Scala project using <a href= "https://www.scala-sbt.org/1.x/docs/index.html">sbt</a>. sbt is a popular tool for compiling, running, and testing Scala projects of any size. Using a build tool such as sbt (or Maven/Gradle) becomes essential once you create project with dependencies or more than one code file.

### Creating the project

In this section, we'll show you how to create the project in IntelliJ.

1. If you didn't create the project from the command line, open up IntelliJ and select "Create New Project"
	+ On the left panel, select Scala on right panel, select sbt.
	+ Click **Next**
	+ Name the project "SbtExampleProject"
	
### Understanding the directory structure

sbt creates many directories which can be useful once you start building more complex project. You can ignore most of them for now but here's glance at what everything is for:

- .idea (IntelliJ files)
- project (plugins and additional setting **for** sbt)
- src (sorce files)
	+ main (application) code
		* java (Java source files)
		* scala (Scala source files) <-- This is all we need for now
		* scala-2.12 (Scala 2.12 specific files)
	+ test (unit test)
- target (generated files)
- build.sbt (build definition file **for** sbt)

## Writing Scala code

1. On the **Project** panel on the left, expand <code>SbtExampleProject</code>=><code>src</code>=><code>main</code>
2. Right click <code>scala</code> and select **New** => **Package**
3. Name the package <code>example</code> and click **OK**
4. Right-click the package <code>example</code> and select **New**=>**Scala class.**
5. Name the class <code>Main</code> and change the **Kind** to <code>object</code>.
6. Change the code in the class to the following:

```
object Main extends App {
    val ages = Seq(42, 75, 29, 64)
    println(s"The oldest person is ${ages.max}")
}
```

## Running the project

1. From the **Run** menu, select **Edit configurations**
2. Click the **+** button and select **sbt Task**
3. Name it <code>Run the program</code>.
4. In the **Task** field, type <code>\~run</code>. The <code>\~</code> causes sbt to rebuild and rerun the project when you save changes to a file in the project.
5. Click **OK.**
6. On the **Run** menu click **Run 'Run the program'.**
7. In the code, change <code>75</code> to <code>61</code> and look at the updated output in the console.

## Adding a dependency

Changing gears a bit, let's look at how to use published libraries to add extra funtionality to our apps.

1. Open up <code>build.sbt</code> and add the following line:

```
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
```

Here, <code>libraryDependencies</code> is a set of dependencies, and by using <code>+=</code>, we're adding the scala-parser-combinators dependency to the set of dependencies that sbt will go and fetch when it start up. Now in any Scala file, you can import classes, object, etc. from scala-parser-combinators with a regular import.

# Testing Scala in Intellij with scalatest

