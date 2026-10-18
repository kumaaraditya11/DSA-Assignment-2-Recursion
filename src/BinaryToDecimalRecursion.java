import java.util.Scanner;

public class BinaryToDecimalRecursion {
    static int decimal(String s, int n) {
        if (n == s.length()) {
            return 0;
        }
        return (s.charAt(n) - '0') * (int) Math.pow(2, s.length() - 1 - n)
                + decimal(s, n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(decimal(s, 0));
    }
}