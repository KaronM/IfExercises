# Student Report Card Exercise

The goal of this exercise is to help students practice implementing a Java class and using if statements.

## Class Implementation

The class to be implemented is called `StudentReportCard`, which represents a student's report card with the following properties:

- Student Name (a string)
- Student ID (a string)
- Mathematics Grade (an integer)
- English Grade (an integer)
- Science Grade (an integer)
- History Grade (an integer)

## Methods

The `StudentReportCard` class should also have the following methods:

- `calculateAverage()` - This method calculates the average of all grades and returns the result.
- `determineGrade()` - This method determines the overall grade for the student based on the average calculated by the `calculateAverage` method. The grades should be determined using the following scale:
    - 90-100: A
    - 80-89: B
    - 70-79: C
    - 60-69: D
    - Below 60: F

## Main Class

A `Main` class should also be created with a `main` method that creates a new `StudentReportCard` object with a student name, ID, and grades. The method should use the `calculateAverage` and `determineGrade` methods to determine the average and overall grade for the student and print the results.

## Example Output

```
Student Name: John Doe
Student ID: 12345
Average Grade: 82.0
Overall Grade: B
```


## How to Run

Compile both the `StudentReportCard` and `Main` classes using the `javac` command and then run the `Main` class using the `java` command.

## Tips

- Pay close attention to the data types for each property and method.
- Make sure the if statements in the `determineGrade` method are written correctly.
- Make sure the `calculateAverage` method returns the correct result.

# If-Then Statement Exercises in Java

Java class IfThenExercises that contains several methods to practice the use of if-then statements in Java. Each method is designed to perform a specific task or solve a specific problem, and they can be used to test your understanding of if-then statements and how they work in Java.

Here's a brief overview of the methods included in the class:

- `isPositiveOrNegative(int number)`: Given an integer number, this method returns a string that indicates whether the number is positive, negative, or zero.

- `isLeapYear(int year)`: Given an integer year, this method returns a string that indicates whether the year is a leap year or not.

- `findMax(int x, int y, int z)`: Given three integers x, y, and z, this method returns a string that indicates which of the three numbers is the largest.

- `checkVowel(char letter)`: Given a character letter, this method returns a string that indicates whether the letter is a vowel or not.

- `isDivisible(int numerator, int denominator)`: Given two integers numerator and denominator, this method returns a string that indicates whether the numerator is divisible by the denominator or not.

- `isRightTriangle(int a, int b, int c)`: Given three integers a, b, and c, this method returns a string that indicates whether the numbers represent the sides of a right triangle or not.

These methods are all static methods and should be invoked on the class NOT an instance of `IfThenExercise`.

Here's an example of how you can use the methods in this class:

```java
String result1 = IfThenExercises.isPositiveOrNegative(10);
System.out.println(result1);

String result2 = IfThenExercises.isLeapYear(2020);
System.out.println(result2);

String result3 = IfThenExercises.findMax(10, 20, 30);
System.out.println(result3);

String result5 = IfThenExercises.checkVowel('e');
System.out.println(result5);

String result6 = IfThenExercises.isDivisible(100, 5);
System.out.println(result6);

String result7 = IfThenExercises.isRightTriangle(3, 4, 5);
System.out.println(result7);

```