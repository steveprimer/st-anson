package week0.day2;

import java.util.*;

public class starpattern {
    public static void main(String[] args) {

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++)
         * System.out.print("* ");
         * sc.close();
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++)
         * System.out.print("* ");
         * System.out.println("* ");
         * }
         * 
         * sc.close();
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++)
         * System.out.print("* ");
         * System.out.println();
         * }
         * sc.close();
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int k = 1; k <= (n - i); k++)
         * System.out.print("  ");
         * for (int j = 1; j <= i; j++)
         * System.out.print("* ");
         * System.out.println();
         * sc.close();
         * }
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = n; i >= 1; i--) {
         * for (int j = 1; j <= i; j++)
         * System.out.print("* ");
         * System.out.println();
         * sc.close();
         * }
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = n; i >= 1; i--) {
         * 
         * for (int k = 1; k <= (n - i); k++)
         * System.out.print("  ");
         * for (int j = 1; j <= i; j++)
         * System.out.print("* ");
         * System.out.println();
         * sc.close();
         * }
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = n; i >= 1; i--) {
         * 
         * for (int k = 1; k <= (n - i); k++)
         * System.out.print("    ");
         * for (int j = 1; j <= i; j++)
         * System.out.print("* ");
         * System.out.println();
         * sc.close();
         * }
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++)
         * if (i == 1 || i == n || j == 1 || j == n)
         * System.out.print("* ");
         * else
         * 
         * System.out.print("  ");
         * System.out.println();
         * }
         * 
         * sc.close();
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++)
         * if (i == 1 || i == n || j == 1 || j == n)
         * System.out.print("* ");
         * else
         * 
         * System.out.print("  ");
         * System.out.println();
         * }
         * 
         * sc.close();
         */

        /*
         * int n;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (int i = 1; i <= n; i++) {
         * for (int k = 1; k <= (n - i); k++)
         * System.out.print("  ");
         * for (int j1 = 1; j1 <= i; j1++)
         * System.out.print("* ");
         * for (int j2 = 1; j2 <= i - 1; j2++)
         * System.out.print("* ");
         * System.out.println();
         * sc.close();
         * }
         */

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i <= 1; i--) {

            for (int k = 1; k <= (n - i); k++)
                System.out.print("  ");
            for (int j1 = 1; j1 <= i; j1++)
                System.out.print("* ");
            for (int j2 = 1; j2 <= i; j2++)
                System.out.print("* ");
            System.out.println();
            sc.close();
        }

    }
}