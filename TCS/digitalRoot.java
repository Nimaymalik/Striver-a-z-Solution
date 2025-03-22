package TCS;

public class digitalRoot {

    public static void main(String[] args) {
        int n = 144;
        int d = 0;
        while (n >= 10) {
            int ans = 0;

            while (!n =0) {
                ans += n % 10;
                n = n / 10;
            }
            n = ans;
        }

        System.out.println(n);

    }
}