# String Sorting & Pointers – C

## Overview
This project demonstrates how to sort a 2D array of strings using pointer manipulation in C.  
Instead of sorting the strings in place, it uses an intermediate array and rearranges the pointers accordingly.

## Features
- Uses triple pointers (`const char ***`) to access and sort nested arrays of strings
- Sorts strings alphabetically using `strcmp()`
- Finds and prints the **longest string** in the entire structure
- Dynamically allocates memory for internal sorting

## Technologies
- Language: C
- Concepts: Pointers, Arrays of Strings, String Sorting, Memory Allocation

## How to Compile and Run
```bash
gcc string_sorting_pointers.c -o sort_strings
./sort_strings
