# Types of Errors

1. Syntax error:-
 #include <stdio.h>
int main() {
    printf("Hello World")  // Missing semicolon
    return 0;
}

2. Compilation  error:-
#include <stdio.h>

int main() {
    printf("Value: %d", x);  // 'x' is not declared
    return 0;
}

3. Linker Error:-
#include <stdio.h>

void myFunc();  // Declaration only

int main() {
    myFunc();  // No definition provided
    return 0;
}

4. Runtime  Error :-
#include <stdio.h>

int main() {
    int a = 10, b = 0;
    printf("%d", a / b);  // Division by zero
    return 0;
}

5. Logical Error:-
#include <stdio.h>
int main() {
    int a = 5, b = 10;
    int avg = a + b / 2;  // Incorrect: division has higher precedence
    printf("Average: %d", avg);
    return 0;
}

6. Semantic Error:-

#include <stdio.h>
int main() {
    int x = 5;
    if (x = 10) {  // Assignment instead of comparison
        printf("x is 10");
    }
    return 0;
}






