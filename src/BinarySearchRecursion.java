import java.util.Scanner;

public class BinarySearchRecursion {
    static int search(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            int result = search(arr, x, low, mid - 1);
            return result == -1 ? mid : result;
        }

        if (arr[mid] < x) {
            return search(arr, x, mid + 1, high);
        }

        return search(arr, x, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(search(arr, x, 0, n - 1));
    }
}