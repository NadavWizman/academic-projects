# MinMax Interface + LinkedList + Iterator – Java

## Overview
This project demonstrates the implementation of a **generic `MinMax` interface**, a custom **LinkedList** class, and an **Iterator** for traversing the list. The `LinkedList` stores integer values and supports basic operations such as adding elements, finding the minimum and maximum values, and traversing the list using a custom iterator.

## Features
- **`MinMax<T extends Comparable<T>>` interface**:
  - Provides methods `min()` and `max()` to find the smallest and largest elements in a collection.
  
- **`LinkedList` class**:
  - A simple singly linked list with methods to add elements at the beginning and at the end.
  - `min()` and `max()` methods are implemented to return the smallest and largest values in the list.
  - Supports recursive display of the list.

- **`LIterator` class**:
  - Implements the `Iterator<Integer>` interface to traverse the linked list.
  
## Technologies
- Language: Java
- Concepts: Generics, Object-Oriented Programming, Linked Lists, Iterators

## How to Compile and Run
1. Compile the code:
```bash
javac MinMax.java LinkedList.java LIterator.java Node.java Program.java
