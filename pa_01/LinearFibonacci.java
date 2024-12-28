public class LinearFibonacci {
    public static long calculateFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        long[] f = new long[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int[] ns = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        long[] runtime = new long[ns.length];
        for (int i = 0; i < ns.length; i++) {
            long startTime = System.nanoTime();
            System.out.println(calculateFibonacciNumber(ns[i]));
            long endTime = System.nanoTime();
            runtime[i] = endTime - startTime;
        }
        for (int i = 0; i < ns.length; i++) {
            System.out.println("n: " + ns[i] + " runtime: " + runtime[i] + " ns");
        }
    }
}