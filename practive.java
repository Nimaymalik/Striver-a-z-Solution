import java.util.Arrays;

public class practive {
    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;

    }

    public static int[] lcmAndGcd(int a, int b) {
        int[] arr = new int[2];

        arr[1] = gcd(a, b);
        arr[0] = ((a * b) / gcd(a, b));

        return arr;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(Arrays.toString(lcmAndGcd(a, b)));

    }

}
