import java.util.Scanner;

public class FindMinimumElementRecursion {
    static int minimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], minimum(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minimum(arr, n));
    }
}