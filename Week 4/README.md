# Week 4

For this activity, you will implement two versions of a Factorial program. One will use recursion to calculate the factorial of a number. The other will use iteration to calculate the factorial of a number. Once you have the program working, you need to insert output
statements to show the two strategies work.

### Part 1
Create a Java file named Factorial.java such that it contains the following code. Once you have entered the code, compile the file (javac Factorial.java). Fix any errors before continuing.

```
// Mark Hoffman 01/25/09
//
// Recursive and iterative versions of factorial number
public class Factorial{
// Recursive version of Factorial number
public static int fact1(int n) {
    if (n == 1) {
        return 1;
    } // if
    else {
        int f1 = fact1(n-1);
        int fact1Val = n * f1;
        return fact1Val;
    } // else
} // fact1

// Iterative version of Factorial number
public static int fact2 (int n) {
    int result = 1;
    for(int i = 2; i <= n; i++)
        result = result * i;
    return result;
    } // fact2
} // Factorial
```

Now you need to create a second Java file TestFactorial.java such that it contains the following code. Once you have entered the code, compile the file (javac TestFactorial.java). Fix any errors before continuing.

```
// Mark Hoffman 01/25/09
//
// Test recursive and iterative versions of Factorial number
public class TestFactorial {
    public static void main(String[] args) {
        System.out.println("\nFactorial Number using Recursion\n");
        System.out.println("Result:fact1(6) = " + Factorial.fact1(6));
        System.out.println("\n\nFactorial Number using Iteration\n");
        System.out.println("Result:fact2(6) = " + Factorial.fact2(6));
    }
}
```

Once both files compile successfully, you may run the program by entering the command java TestFactorial. When complete, report your results.

### Part 2
Now, you need to demonstrate how the program works. On pages 146-147 of your textbook, you see a box trace of the recursive version of the Factorial method. To show how this version works you need to show the current value of n and the current call to fact1(n)prior to the call. You also need to show the resulting value after the call. Insert output statements such that your output resembles the textbook. 

Do the same for the iterative version.