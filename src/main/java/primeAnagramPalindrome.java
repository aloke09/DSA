public class primeAnagramPalindrome
{
    public static void main(String[] args) {
        int no=11;
        boolean prime = isPrime(no);
        boolean pal = isPalindrome(no);
        if(pal==true && prime==true)
        {
            System.out.println("palindrome and prime");
        }
        else {
            System.out.println("not palindrome and prime");
        }
    }
    public static boolean isPalindrome(int n)
    {
        int rev=0,temp=n;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        System.out.println(rev);
        if(rev==n)
        {
            return true;
        }
        else
            return false;


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
