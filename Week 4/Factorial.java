// Mark Hoffman 01/25/09
//
// Recursive and iterative versions of factorial number
public class Factorial {
    // Recursive version of Factorial number
    public static int fact1(int n) {
        if (n == 1) {
            return 1;
        } else {
            int f1 = fact1(n - 1);
            int fact1Val = n * f1;
            return fact1Val;
        }
    }
    // Iterative version of Factorial number
    public static int fact2(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}