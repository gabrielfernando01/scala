package com.rockthejvm;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm learning Java!");

        // variables
        int aNumber = 2;
        int anotherNumber = 40;
        int sum = aNumber + anotherNumber;   // sum = 42
        System.out.println("sum is: " + sum);

        // primitive types
        int aInteger = 30;  // integer = 4 bytes
        long aBigNumber = 468464646464512L;   // long = 8 bytes
        float aSmallDecimal = 2.3f; // float = 4 bytes
        double aBigDecimal = 3.14;   // double = 8 bytes
        double aStarsInUniverse = 1.1e21;    // 1.1 * 10^21
        double hydrogenRadius = 5.3e-11; // 5.3 * 10^-11
        char aCharacter = 'v';
        char aDigitCharacter = '5';     // don't confuse '1' whith 1
        boolean aTruthValue = true;

        // string
        String aString = "I love Java!";

        // expression
        // math operations
        int multiplyInt = 2 * 3;
        int divideInt = 7 / 3;  // onlu the quotient is kept for int division
        int remainderInt = 7 % 3; // the remainder of the division

        // incrementing and decrementing
        aNumber++;  // aNumber will became 3
        ++aNumber;  // aNumber will become 4

        // preincrementing and postincrementing
        int someInteger = 4;
        int someInteger2 = someInteger++; // 4, AFTER WHICH someInteger becomes 5
        int someInteger3 = ++someInteger; // someInteger becomes 5, AFTER WHICH someInteger3 becomes 5
        // same for -- (decrementing)

        // math operations with decimals
        double aDoubleSum = 5.3 + 7.5;
        double divideDouble = 7.0 / 3;  // 2.333,,,

        // characrers operations
        char aLetter = 'a';
        aLetter++;  // ASCII code, aLetterbecome 'b'

        // special characters
        char aQuote = '\''; // escape sequence
        char doubleQuote =  '\"'; // double "
        char newLine = '\n'; // new line
        char aTab = '\t'; // tab
        char backSlash = '\\';

        // boolean operations
        boolean numberIsTooBig = aNumber > 100; // evaluates to false
        boolean isLetterMyFavorite = aLetter == 'l'; // == means the COMPARISON EQUALITY operator
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 0);  // && for logical AND, || for logical OR
        boolean negate = !smallOddNumber;

        // String operations
        String concatenation = "I love " + "Java!"; // concatenates strings => "I love Java!"
        System.out.println(concatenation);

        // instructions
        aNumber = 45;   // aNumber BECOMES 45
        aNumber = aNumber + 6; // aNumber becomes 51
        aNumber += 6; // equivalent
        // old variables don't update automatically
        System.out.println("sum is: " + sum);

        // control statements
        int age = 45;
        if (age < 30) { // if/else statements
            System.out.println("You're just getting started");
            System.out.println("Something else!");
        } else {
            System.out.println("Perfect time to start learning Java");
            age += 1;
            System.out.println("You're age has become " + age + " years old");
        }

        // chain if-else statements
        int temperature = 22;
        if (temperature < 20) {
            System.out.println("Quite chill outside, maybe take a jacket");
        } else if (temperature < 25) {
            System.out.println("Very pleasant outside, take a walk.");
        } else {
            System.out.println("It's getting hot, maybe take some water.");
        }

        // while loops: test conditions, then execute
        System.out.println("Watch me cout to 10!");
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // do-while loop: execute, then test condition
        counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

        // for loops: iterate over a range
        for (
                int i = 1;  // starting instruction
                i <= 10;    // continuation condition
                i++         // instruction to execute AFTER the contents
        ) {
            System.out.println(i);  // contents to execute
        }
        /*
            for structure operations (pseudo-code)

            execute starting instruction;
            as long as (continuation condition) {
                run contents;
                instruction to execute after the contents
            }
         */

        // reference type
        // instantiate: create a instance of a class
        Person alice = new Person();    // alice is an INSTANCE of Person
        alice.username = "Alice";
        alice.age = 25;
        Person bob = new Person(); // bob is an INSTANCE of Person
        bob.username = "Bob";
        bob.age = 24;
        System.out.println(
                alice.username + " say to " + bob.username + ": happy birthday for turning " + bob.age + "!"
        );
    }
}

class Person {  // REFERENCES TYPE
    // fields; pieces of information attached to a single type
    String username;
    int age;
}