public class Recursividad {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("El término " + number + " de la secuencia de Fibonacci es: " + fibonacci(number)); // sin recursividad.
        System.out.println("El término " + number + " de la secuencia de Fibonacci es: " + fibonacciRecursive(number));// con recursividad.
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev1 = prev2;
            prev2 = fib;
        }
        return fib;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
