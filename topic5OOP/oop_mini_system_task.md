# OOP University Management System

Design and implement a small academic system using Java classes.

You are required to define the following classes.

## Class `Person`

Define a class `Person` with the following attributes:

-   `firstName`
-   `lastName`
-   `gender`

Provide:

-   constructor(s)
-   getter and setter methods
-   `toString()` method

## Class `Teacher`

Define a class `Teacher` that extends `Person`.

It should also have the following attribute:

-   `teacherId`

Provide:

-   constructor(s)
-   getter and setter methods
-   `toString()` method

## Class `Course`

Define a class `Course` with the following attributes:

-   `courseCode`
-   `title`
-   `Teacher teacher`

Provide:

-   constructor(s)
-   getter and setter methods
-   `toString()` method

A course has one teacher.


## Class `Student`

Define a class `Student` that extends `Person`.

It should also have the following attributes:

-   `studentId`
-   `Course[] courses`

Provide:

-   constructor(s)
-   getter and setter methods
-   `toString()` method

A student takes courses, so the `courses` attribute should store the
courses taken by that student.

## UML Requirement

Before writing the code, draw the UML class diagram for the system.

Your UML diagram must clearly show:

-   the inheritance relationship between `Person`, `Teacher`, and
    `Student`
-   the association between `Course` and `Teacher`
-   the association between `Student` and `Course`
-   the main attributes and methods of each class

## Required Logic

Implement the following method in class `Student`:

- *public boolean takesCourse(String courseCode)*

This method should return `true` if the student takes the given course,
and `false` otherwise.

In the `Main` class, implement the following methods:

### 1. Which students take a given course

- *public static void printStudentsByCourse(String courseCode, Student\[\]
students)*

This method should print all students who take the given course.

### 2. Which students a given teacher teaches

- *public static void printStudentsByTeacher(String teacherId, Student\[\]
students)*

This method should print all students taught by the given teacher.

A student is taught by a teacher if the student takes at least one
course taught by that teacher.

## Main Class

Create a `Main` class to test your program.

In `main()`:

-   create at least 2 teachers
-   create at least 4 courses
-   create at least 4 students
-   assign a teacher to each course
-   assign courses to students
-   print all created objects
-   call the methods to:
    -   print the students taking a given course
    -   print the students taught by a given teacher

## Required Scenario

Use a scenario similar to the following when testing your program:

-   Teacher `T101` teaches `Java Programming`
-   Teacher `T102` teaches `Database Systems`
-   Teacher `T101` also teaches `Object-Oriented Programming`
-   Student `S001` takes `Java Programming` and `Database Systems`
-   Student `S002` takes `Java Programming` only
-   Student `S003` takes `Database Systems` only
-   Student `S004` takes `Object-Oriented Programming` only

You may also add one more student or one more course if needed.

## Notes

-   Use arrays, not `ArrayList`
-   Keep the logic simple
-   No menu is needed
-   No user input is needed
-   No advanced validation is needed

## What your program should demonstrate

Your test should clearly show results for:

-   Which students take `Java Programming`?
-   Which students take `Database Systems`?
-   Which students does teacher `T101` teach?
-   Which students does teacher `T102` teach?
