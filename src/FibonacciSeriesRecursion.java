import java.util.Scanner;

public class FibonacciSeriesRecursion {
    static void fibonacci(int n, int a, int b) {
        if (n == 0) {
            return;
        }

        System.out.print(a + " ");
        fibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci(n, 0, 1);
    }
}