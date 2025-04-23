package Basic;
public class ReverseNumber {
    public static void reverse(int n) {
        int rev = 0;
        int d = 0;
        

        while (n > 0) {
            d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int n = 153;
        reverse(n);
    }

}
