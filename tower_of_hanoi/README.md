# Tower of Hanoi with Adjacency Constraint – C

## Overview
This project implements a variation of the classic **Tower of Hanoi** problem using recursion, where **disks can only move between adjacent columns**.

Unlike the standard version, this constraint introduces a more complex recursive strategy, requiring temporary moves through an intermediate tower.

## Features
- Solves the Tower of Hanoi problem for any number of disks
- Only allows moving disks between **adjacent pegs** (e.g., from 1 to 2, not 1 to 3)
- Uses a recursive function `adjacentHanoi()`
- Displays each step clearly via `printf()`

## Technologies
- Language: C
- Concepts: Recursion, Algorithm Design

## How to Compile and Run
```bash
gcc tower_of_hanoi.c -o hanoi
./hanoi
