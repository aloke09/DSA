package PrimeAnagramStack;

public class isPrime
{
    public static boolean isP(int no) {
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }
}
