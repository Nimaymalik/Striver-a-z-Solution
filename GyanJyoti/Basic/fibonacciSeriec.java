package Basic;
import java.util.Scanner;

public class fibonacciSeriec {
    public static int fibo(int n) {

        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            System.out.println(fibo(i));
        }
        sc.close();

    }

}
