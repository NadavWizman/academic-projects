#include <stdio.h>
#include <stdlib.h>

typedef enum {
    DEAD = 0,
    ALIVE = 1
} CellState;

typedef CellState Board[10][10][10];

void printBoard(Board board, int c, int r, int gen) {
    printf("Generation %d:\n", gen);
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            printf("%d ", board[gen][i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

int countAliveNeighbors(Board board, int g, int c, int r, int x, int y) {
    int count = 0;
    int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    for (int i = 0; i < 8; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < c && ny >= 0 && ny < r) {
            count += board[g][nx][ny];
        }
    }
    return count;
}

void computeNextGeneration(Board board, int currentGen, int nextGen, int c, int r) {
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            int aliveNeighbors = countAliveNeighbors(board, currentGen, c, r, i, j);
            if (board[currentGen][i][j] == ALIVE) {
                board[nextGen][i][j] = (aliveNeighbors == 2 || aliveNeighbors == 3) ? ALIVE : DEAD;
            } else {
                board[nextGen][i][j] = (aliveNeighbors == 3) ? ALIVE : DEAD;
            }
        }
    }
}

int main() {
    int generations, rows, cols;

    printf("Enter the number of generations, rows, and columns: ");
    if (scanf("%d %d %d", &generations, &rows, &cols) != 3) {
        printf("Invalid input!");
        return 1;
    }

    if (generations > 10 || rows > 10 || cols > 10) {
        printf("Dimensions exceed maximum allowed size (10x10x10).");
        return 1;
    }

    Board board = {0};
    printf("Enter the initial board state (%d rows, %d columns):\n", rows, cols);
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (scanf("%d", &board[0][i][j]) != 1) {
                fprintf(stderr, "Invalid input!\n");
                return 1;
            }
        }
    }

    for (int g = 0; g < generations - 1; g++) {
        printBoard(board, rows, cols, g);
        computeNextGeneration(board, g, g + 1, rows, cols);
    }

    printBoard(board, rows, cols, generations - 1);

    return 0;
}
