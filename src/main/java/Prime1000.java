public class Prime1000 {
    public static void main(String[] args) {
        findPrime(1000);
    }

    public static void findPrime(int x) {
        for (int i = 10; i <= x; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            } else {
//                System.out.println(i + " is not a prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
