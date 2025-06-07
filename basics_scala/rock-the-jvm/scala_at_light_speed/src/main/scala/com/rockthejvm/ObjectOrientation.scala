package com.rockthejvm

object  ObjectOrientation extends App {
  // class and instance
  class Animal {

    // define fields
    val age: Int = 0

    // define methods
    def eat() = println("I'm eating")
  }

  val anAnimal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal // constructor definition

  val aDog = new Dog("Lassie")

  // constructor arguments are NOT fields: need to put a val before the constructor argument
  aDog.name

  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Hichie")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs: Boolean = true // by default public, can restrict by adding private or protected

    def walk(): Unit
  }

  // "interface": ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit // valid method name
  }

  // Single class inheritance, multi-trait "mixing"
  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("I'm eating you, animal!")

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation = object method argument, only avaible for methods with ONE argument
  aCroc ?! "What if we could fly?"

  // Operators in Scala are actually methods
  val basicMath = 1 + 2
  val anotherBasicMath = 1.+(2) // equivalent

  // anonymous classes
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I'm a dinosaur so I eat pretty much everything")
  }

  /*
  What you tell the compiler

  class Carnivore_Anonymous_35728 extends Carnivore {
    override def eat(animal: Animal): Unit = println("I'm a dinosaur so I eat pretty much everything")
    val dinosaur = new Carnivore_Anonymous_35728
   */

  // singleton object
  object MySingleton {  // the only instance of the mySingleton type
    val mySpecialValue = 53471
    def mySpecialMethod: Int = 5321
    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(65)
  MySingleton(65) // equivalent to MySingleton.apply(65)
}
