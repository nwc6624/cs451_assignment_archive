// Fibonacci calculator using a slow, recursive method.

public class ExponentialFibonacci {

    // Recursive method to find Fibonacci numbers.
    public static long fib1(int n) {
        // Base cases: 0 returns 0, 1 returns 1.
        if (n == 0) return 0;
        else if (n == 1) return 1;
        
        // Recursive case: sum of two previous Fibonacci numbers.
        return fib1(n - 1) + fib1(n - 2);
    }

    // Testing Fibonacci numbers for 0 to 9 and measuring runtime.
    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Fibonacci Numbers:");

        for (int n : testCases) {
            // Recording time before calculation.
            long startTime = System.nanoTime();
            
            // Calculating Fibonacci number for the test case.
            long result = fib1(n);
            
            // Recording time after calculation.
            long endTime = System.nanoTime();
            
            // Displaying Fibonacci result, input value (n), and runtime in nanoseconds.
            System.out.println("Fibonacci(" + n + ") = " + result + ", Runtime: " + (endTime - startTime) + " ns");
        }
    }
}