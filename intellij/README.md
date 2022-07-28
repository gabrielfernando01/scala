![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/idea.jpeg)

## Getting started with scala in Intellij

### Creating the project

1. Open IntelliJ and click **File** => **New** => **Project**
2. On the left panel, select Scala. On the right panel select IDEA.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/new_project.png)

3. Assuming this is your first time creating a Scala project with IntelliJ, you'll need to install a Scala SDK. To the right of the Scala SDK field, click the **Create** botton.

### Writing code

1. Once the **Project** pane on the left, right-click <code>src</code> and select **New** >= **Scala class**. If you don't see **Scala class**
2. Name the class <code>Hello</code> and change the **Kind** to <code>object</code>.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/main/intellij/image/new_project.png)

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

