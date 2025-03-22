package BasicMath;

public class ArmStrong {
    public static void ArmstronfNumber(int n) {
        int originalNumber = n;
        int armstrong = 0;
        int d = 0;
        int k = String.valueOf(n).length();


        while (n > 0) {
            d = n % 10;
            armstrong += Math.pow(d, k);
            n = n / 10;

        }
        if (originalNumber == armstrong) {
            System.out.println("ArmStrong number");

        } else {
            System.out.println("Not Armstrong");
        }

    }

    public static void main(String[] args) {
        int num = 1634;
        ArmstronfNumber(num);
    }

}
