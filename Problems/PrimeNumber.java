package DSA.Problems;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        if (n==2){
            return true;
        }
        for (int i = 2 ; i<=(int) Math.sqrt(n) ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(11));
        System.out.println(isPrime(8));
    }
}
