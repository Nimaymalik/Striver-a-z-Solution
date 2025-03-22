package BasicMath;

public class GCD {
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

    public static void main(String[] args) {
        int first = 14;
        int second = 8;
        System.out.println(gcd(first, second));

    }

}
