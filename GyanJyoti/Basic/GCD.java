package Basic;
public class GCD {
    public static long gcd(long first, long second) {
        while(second!=0){
            long temp=second;
            second= second%first;
            first=temp;

        }
        return first;

    }

    public static void main(String[] args) {
        long first = 12345678;
        long second = 876543210;

        System.out.println("GCD of two numbers " + gcd(first, second));

    }

}
