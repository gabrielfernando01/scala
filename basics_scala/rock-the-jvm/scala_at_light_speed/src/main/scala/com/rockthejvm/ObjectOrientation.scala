package com.rockthejvm

object ObjectOrientation extends App {

  // class and instance
  class Animal{

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
  aDeclaredAnimal.eat()   // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal{
    val hasLegs: Boolean = true   // by default public, can restrict by adding private or protected
    def walk(): Unit
  }

  // "interface": ultimate abstract type
  trait Carnivore{
    def eat(animal: Animal): Unit
  }
}

// System.out.println("Hello, world!");
