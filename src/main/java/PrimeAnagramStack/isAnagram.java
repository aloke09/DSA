package PrimeAnagramStack;

public class isAnagram
{
    public static boolean isA(int no) {
        int temp = no;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (no == rev) {
            return true;
        } else {
            return false;
        }

    }
}
