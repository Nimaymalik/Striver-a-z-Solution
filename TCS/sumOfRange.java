package TCS;

public class sumOfRange {
    public static void numbersRange(int first, int second) {
        int sum=0;
        for (int i = first; i <= second; i++) {
            sum+=i;
            

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        numbersRange(5,9);

    }
}