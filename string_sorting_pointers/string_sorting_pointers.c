#include <stdio.h>
#include <string.h>
#include <stdlib.h> 


void printAllStrings(const char ***a){
    for (int i=0; a[i]!=NULL; i++) {
        for (int j=0; a[i][j]!=NULL; j++) {
            printf("%s\n", a[i][j]);
        }
    }
}

void arrange(char **a, int size) {
    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (strcmp(a[i], a[j]) > 0) {
                char *temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}

void sort(const char ***a) {
    int totalStrings = 0;
    for (int i = 0; a[i] != NULL; i++) {
        for (int j = 0; a[i][j] != NULL; j++) {
            totalStrings++;
        }
    }

    char **allStrings = (char **)malloc(totalStrings * sizeof(char *));
    if (allStrings == NULL) {
        perror("Failed to allocate memory");
        return;
    }

    int k = 0;
    for (int i = 0; a[i] != NULL; i++) {
        for (int j = 0; a[i][j] != NULL; j++) {
            allStrings[k++] = (char *)a[i][j];
        }
    }

    arrange(allStrings, totalStrings);

    k = 0;
    for (int i = 0; a[i] != NULL; i++) {
        for (int j = 0; a[i][j] != NULL; j++) {
            a[i][j] = allStrings[k++];
        }
    }

    free(allStrings);
}

char *maxLengthString(const char ***a) {
    char *longest = NULL;
    size_t maxLength = 0;

    for (int i = 0; a[i] != NULL; i++) {
        for (int j = 0; a[i][j] != NULL; j++) {
            size_t len = strlen(a[i][j]);
            if (len > maxLength) {
                maxLength = len;
                longest = (char *)a[i][j];
            }
        }
    }

    return longest;
}


int main() {
    const char * arrP1[] = { "father", "mother", NULL };
    const char * arrP2[] = { "sister", "brother", "grandfather", NULL };
    const char * arrP3[] = { "grandmother", NULL };
    const char * arrP4[] = { "uncle", "aunt", NULL };
    const char ** arrPP[] = { arrP1, arrP2, arrP3, arrP4, NULL };

    printf("Original array:\n");
    printAllStrings(arrPP);

    sort(arrPP);

    printf("\nSorted array:\n");
    printAllStrings(arrPP);

    printf("\nLongest string:\n");
    printf("%s\n", maxLengthString(arrPP));

    return 0;
}
