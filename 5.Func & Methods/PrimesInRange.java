public class PrimesInRange {

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

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
        System.out.println(); // Print a new line after listing all primes
    }

    public static void main(String[] args) {
        primesInRange(3000);
    }
}