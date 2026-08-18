# Java Exception Handling Assessment

This repository contains Java programs created to practice and understand **Exception Handling in Java**. The exercises demonstrate how exceptions can be detected, thrown, declared, and handled using Java's exception-handling mechanisms.

## Topics Covered

* Exception Handling in Java
* `try` and `catch` blocks
* `throw` keyword
* `throws` keyword
* Checked and Unchecked Exceptions
* `ArithmeticException`
* `IOException`
* `FileNotFoundException`
* File Handling using `Files`, `Path`, and `Scanner`
* User Input using `Scanner`
* Arrays and Duplicate Detection
* String and Character Validation
* Exception Handling with Methods

## Programs

### Q1 – Basic Try-Catch Exception Handling

Demonstrates basic exception handling by performing division by zero and catching the resulting `ArithmeticException`.

### Q2 – Odd Number Exception

Reads an integer from the user and throws an exception when the entered number is odd.

### Q3 – File Not Found Exception

Creates a method that reads data from a file and handles an exception when the requested file cannot be found or accessed.

### Q4 – Positive Number Exception

Reads a list of numbers from a file and throws an exception when a positive number is encountered.

### Q5 – Empty File Exception

Reads the contents of a file and throws an exception when the file is empty.

### Q6 – Duplicate Number Exception

Reads multiple integers from the user, compares the values using nested loops, and throws an exception when a duplicate number is detected.

### Q7 – No Vowels Exception

Takes a String as input, checks each character for vowels, and throws an exception when the String does not contain any vowels.

## Exception Handling Syntax

```java
try {
    // Code that may cause an exception
} catch (Exception e) {
    // Handle the exception
}
```

### Using `throw`

The `throw` keyword is used to explicitly throw an exception.

```java
if (condition) {
    throw new Exception("Exception message");
}
```

### Using `throws`

The `throws` keyword is used in a method declaration to indicate that the method may throw an exception.

```java
public static void methodName() throws Exception {
    // Code that may throw an exception
}
```

## Key Learning

Through these exercises, I practiced how to:

* Identify code that may cause exceptions.
* Handle exceptions using `try-catch`.
* Explicitly throw exceptions using `throw`.
* Declare exceptions using `throws`.
* Handle file-related exceptions.
* Apply exception handling with loops, arrays, Strings, and user input.
* Prevent abnormal program termination by handling exceptions appropriately.

## Technologies Used

* Java
* Java NIO (`Files` and `Path`)
* Java I/O
* Scanner
* VS Code
* Git & GitHub

## How to Run

Compile a Java program:

```bash
javac q1.java
```

Run the compiled program:

```bash
java q1
```

Replace `q1` with the required program name, such as:

```bash
javac q6.java
java q6
```

## Repository Structure

```text
Exception/
├── q1.java
├── q2.java
├── q3.java
├── q4.java
├── q5.java
├── q6.java
├── q7.java
└── README.md
```

## Purpose

The purpose of this assessment is to build a strong understanding of **Java Exception Handling** and learn how exceptions can be handled in practical situations involving arithmetic operations, files, arrays, user input, and Strings.
