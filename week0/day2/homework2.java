package week0.day2;

import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        // int n; LINE
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++)
        // System.out.print(" x");
        // sc.close();

        // int n; SQUARE
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++)
        // System.out.print(" *");
        // System.out.println();
        // sc.close();
        // }

        // int n; RIGHT FACING TRIANGLE
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++)
        // System.out.print(" *");
        // System.out.println();
        // sc.close();
        // }

        // int n; LEFT FACING TRAINGLE
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n - i; k++)
        // System.out.print(" ");
        // for (int j = 1; j <= i; j++)
        // System.out.print(" *");
        // System.out.println();
        // sc.close();
        // }

        // int n; INVERTED RIGHT FACING TRIANGLE
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++)
        // System.out.print(" *");
        // System.out.println();
        // sc.close();
        // }

        int n; // INVERTED LEFT FACING TRIANGLE
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            System.out.println();
            sc.close();
        }

    }

}
