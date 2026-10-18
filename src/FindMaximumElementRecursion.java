import java.util.Scanner;

public class FindMaximumElementRecursion {
    static int maximum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], maximum(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maximum(arr, n));
    }
}