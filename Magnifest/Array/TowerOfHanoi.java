package Magnifest.Array;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void HanoiOrint(int n, char a, char c, char b) {
        // A for start
        // c for destination
        // b for auxillary

        if (n == 0) {
            return;
        }
        HanoiOrint(n - 1, a, b, c);
        System.out.println("Move disk " + n + "from" + a + "to" + c);
        HanoiOrint(n - 1, b, c, a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        HanoiOrint(inp, 'A', 'C', 'B');
        sc.close();
    }

}
