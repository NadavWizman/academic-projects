# Bitwise Operations & Binary Representation – C

## Overview
This project demonstrates various **bitwise operations** in C, including:

- Displaying an integer in binary format
- Performing a circular bit shift (carousel)
- Converting a string of digits into a single integer using binary manipulation

## Features
- `printBinary(int num)` – Prints the 32-bit binary representation of a number
- `carousel(int a, int n)` – Performs a left circular shift of bits
- `convert(char* s)` – Converts a digit string (e.g., `"12345678"`) into a single binary-encoded integer

## Technologies
- Language: C
- Concepts: Bitwise operations, binary math, string manipulation

## How to Compile and Run
```bash
gcc bitwise_operations.c -o bitwise
./bitwise

## Program Output Example
Initial number is: 12342 and in binary is equal to: 00000000000000000011000000100110
Using carousel when n=51 we get the number: 403017057 and in binary is equal to: 00011000001001100000000000000001

String 12345678 converted to binary as an integer: 00000000000011000011101001111000
