package TCS;

public class range {
    public static void printRange(int m, int n) {
        int ans = 0;

        for (int i = m; i <= n; i++) {
            ans += i;
        }
        System.out.println("Range from m to n = " + ans);
    }

    public static void main(String[] args) {

        printRange(0, 2);
    }
}