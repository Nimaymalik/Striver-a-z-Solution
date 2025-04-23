package Basic;

public class Prime {
    public static boolean PrimeChecker(int n) {
        // prime numbetr from 1-n range
        if (n == 1 || n == 0) {
            return false;

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int n = 14;

    //    To give the range of the prime number
        for (int i = 1; i <n; i++) {
            if(PrimeChecker(i)){
                System.out.print(i+ " ");
            }
            
        }
        
        // to check that the given no is prime or not
        if(PrimeChecker(n) == false){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }



    }

}
