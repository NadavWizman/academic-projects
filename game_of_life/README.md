# Game of Life – C

## Overview
This project implements a simulation of **Conway's Game of Life** in C, using a 3D array to represent multiple generations of a grid-based life system.

Each cell can be either **ALIVE (1)** or **DEAD (0)**, and transitions between states based on the number of live neighbors.

## Features
- Uses a 3D array: `[generation][row][column]`
- Tracks and computes multiple generations
- Rules follow Conway’s Game of Life:
  - Alive cell with 2 or 3 neighbors survives
  - Dead cell with exactly 3 neighbors becomes alive
- Limits board size to 10x10 and 10 generations for simplicity

## Technologies
- Language: C
- Concepts: Arrays, Simulation, 2D/3D Grid Processing, Enum, Recursion

## How to Compile and Run
```bash
gcc game_of_life.c -o game_of_life
./game_of_life
