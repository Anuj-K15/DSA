public class PrimeOrNot {

    // public static boolean isPrime (int n) {
    // if (n==2){
    // return true; // 2 is the only even prime number
    // }

    // for (int i = 2; i<=n-1; i++) {
    // if (n % i == 0) {
    // return false; // If n is divisible by any number other than 1 and itself, it
    // is not prime
    // }
    // }
    // return true;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true; // 2 is the only even prime number
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
