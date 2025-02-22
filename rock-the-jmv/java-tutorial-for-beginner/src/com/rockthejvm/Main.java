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
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 0);

    }

}
