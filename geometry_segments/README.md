# Geometry & Segment Operations – Java

## Overview
This project includes a simple **geometry framework** written in Java, featuring classes for **`Point`** and **`Segment`**, and demonstrating object-oriented concepts such as constructors overloading, method overloading, and object comparison.

- **`Point`** represents a 2D point with `x` and `y` coordinates.
- **`Segment`** represents a line segment between two `Point` objects and includes methods for calculating the length, midpoint, and comparing two segments.

## Features
- **Point Class**:
  - Represents a point with `x` and `y` coordinates.
  - Methods: `getX()`, `getY()`, and `show()`.
  
- **Segment Class**:
  - Represents a segment with two `Point` objects (`first` and `second`).
  - Multiple constructors: 
    - Two `Point` objects, 
    - Two `float` coordinates or mixed.
  - Methods:
    - `show()` to print the segment.
    - `middle()` to return the midpoint of the segment.
    - `length()` to calculate the length using the Euclidean distance.
    - `greaterThan()`, `lessThan()`, `equals()`, and `compareTo()` for comparing two segments.

- **Program Class**:
  - Creates several instances of `Segment` and `Point`, reads segment data from the user, compares segments, and outputs results.

## Technologies
- Language: Java
- Concepts: Object-Oriented Programming, Geometry, Segment Operations, Comparison Logic

## How to Compile and Run
1. Compile the code:
```bash
javac Point.java Segment.java Program.java
