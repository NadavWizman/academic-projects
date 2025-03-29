#include <stdio.h>

void adjacentHanoi(int n, int from, int to, int via) {
    if (n == 0) {
        return;
    }

    if ((from == 1 && to == 3) || (from == 3 && to == 1)) {

        adjacentHanoi(n, from, via, to);
        adjacentHanoi(n, via, to, from);
        return;
    }

    adjacentHanoi(n - 1, from, via, to);

    printf("Move disk %d from column %d to column %d\n", n, from, to);

    adjacentHanoi(n - 1, via, to, from);
}

int main() {
    int n = 3;
        printf("Tower of Hanoi with %d disks:\n", n);
        adjacentHanoi(n, 1, 3, 2);
        printf("\n");
        
        return 0;
}

