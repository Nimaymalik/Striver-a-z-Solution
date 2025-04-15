package BasicMath;

import java.util.Scanner;

public class factors {

    public static int gcd(int first, int second) {
        while (first > 0 && second > 0) {
            if (first > second) {
                first %= second;
            } else {
                second %= first;
            }
        }
        if (second == 0) {
            return first;
        }
        return second;
    }

    public static void fractions(int num1, int num2, int num3, int num4) {
        int gcd = (num2 * num4) / gcd(num2, num4);

        if (num2 < gcd) {
            int div = gcd / num2;
            num1 *= div;
            if ((num1 + num3) % 2 == 0 && gcd % 2 == 0) {

                System.out.println((num1 + num3) / 2 + "/" + gcd / 2);
            } else {
                System.out.println(num1 + num3 + "/" + gcd);

            }

        } else {
            int div = gcd / num4;
            num3 *= div;
            if ((num1 + num3) % 2 == 0 && gcd % 2 == 0) {

                System.out.println((num1 + num3) / 2 + "/" + gcd / 2);
            } else {
                System.out.println(num1 + num3 + "/" + gcd);

            }
        }

    }

    public static void main(String[] args) {
        int num1, num2, num3, num4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator of first");
        num1 = sc.nextInt();

        System.out.println("Enter the denominator of first");
        num2 = sc.nextInt();

        System.out.println("Enter the numerator of second");
        num3 = sc.nextInt();

        System.out.println("Enter the denominator of second");
        num4 = sc.nextInt();

        fractions(num1, num2, num3, num4);
        sc.close();

    }
}
