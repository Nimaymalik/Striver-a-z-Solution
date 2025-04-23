package Basic;
public class GCDANDLCM {
    public static int gcd(int first, int second) {
        while (first > 0 && second > 0) {
            if (first > second) {
                first %= second;
            } else {
                second %= first;
            }
        }
        if (first == 0) {
            return second;
        }
        return first;

    }

    public static void main(String[] args) {
        int first = 12;
        int second = 36;

        int lcm = (first * second) / gcd(first, second);

        System.out.println("GCD of two number is " + gcd(first, second) + " Lcm of two numbers " + lcm);

    }

}
