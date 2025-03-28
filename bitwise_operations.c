#include <stdio.h>
#include <string.h>

void printBinary(int num) {
    for (int i = 31; i >= 0; i--) {
        printf("%d", (num >> i) & 1);
    }
    printf("\n");
}

int carousel(int a, int n){
    while (n<31){
        n -= 32;
    }
    
    int temp=a>>(32-n);
    int result = (a<<n)+temp;
    return result;
        
}

int convert(char* s) {
    int result = 0;
    char str[] = "12345678";
    int num;
    sscanf(str, "%d", &num);
    for (int i=0; i<=28; i+=4) {
        int temp = num%10;
        num/=10;
        temp<<=i;
        result+=temp;
    }
    return result;
}
int main(){
    int initial = 12342;
    int after = carousel(initial,51);
    printf("\n");
    printf("Initial number is: %d and in binary is equal to: ",initial);
//    printf("Initial number in binary is: ");
    printBinary(initial);
    printf("Using carousel when n=51 we get the number: %d and in binary is equal to: ",after);
//    printf("After carousel in binary is: ");
    printBinary(after);
    printf("\n");

    printf("String 12345678 converted to binary as an integer: ");
    printBinary(convert("12345678"));
    printf("\n");
    
        return 0;
    }
