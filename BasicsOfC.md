1. #include <stdio.h>  // Preprocessor directive

int main() {        // Main function
    printf("Hello, World!");  // Output
    return 0;       // End of program
}

2. Data Types

Type	Description	Example
int	    Integer	                 int a = 5;
float	Floating point number	 float b = 5.5;
char	Character	             char c = 'A';
double	Double precision float	 double d = 3.14;

3. Input and output
// Input
int age;
scanf("%d", &age);

// Output
printf("Age: %d", age);

4. Functions
void greet() {
    printf("Hello!");
}

int main() {
    greet();  // Function call
    return 0;
}

5. Arrays input

#include <stdio.h>

int main() {
    int arr[5];  // Declare an array of size 5
    int i;

    // Input elements into the array
    printf("Enter 5 integers:\n");
    for(i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    return 0;
}

6. function of string
strlen(str)	    Length of string
strcpy(a, b)	Copy b into a
strcat(a, b)	Concatenate b to a
strcmp(a, b)	Compare a and b


