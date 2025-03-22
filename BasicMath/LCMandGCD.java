package BasicMath;

public class LCMandGCD {

    public static int lcmANDgcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }

        }
        if (b == 0) {
            return a;

        }
        return b;

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 7;

        System.out.println(
                "LCM of two numbers is " + ((a * b) / lcmANDgcd(a, b)) + " GCD of two numbers is " + lcmANDgcd(a, b));

    }

}
