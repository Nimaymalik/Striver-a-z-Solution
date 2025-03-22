package BasicMath;

public class Palindrome {
    public static void palindromeNumber(int n) {
        int d = 0;
        int palin = 0;
        int originalnum = n;

        while (n > 0) {
            d = n % 10;
            palin = (palin * 10) + d;
            n = n / 10;

        }
        if (palin == originalnum) {
            System.out.println("Palindome number");

        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 1;
        palindromeNumber(num);
    }
}