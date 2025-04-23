package Basic;
public class Armstrong {
    public static void Armstring(int n) {
        int d = 0;
        int rev = 0;
        int original=n;
        int sum=0;

        int k = String.valueOf(n).length();

        while (n > 0) {
            d = n % 10;
            rev += Math.pow(d, k);
            n = n / 10;

            sum+=d;
        }
        System.out.println(sum);
        if(rev == original){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        int n = 153;
        Armstring(n);

    }

}
