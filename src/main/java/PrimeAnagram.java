import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagram
{
    static ArrayList<Integer>al=new ArrayList<>();
    public static void main(String[] args)
    {
        prime(1000);
    }
    public static void prime(int no)
    {
        int count=0;
        int []a=new int [200];
        for(int i=7;i<no;i++)
        {
            boolean prime = isPrime(i);
            boolean anagram = isAnagram(i);
            if(prime && anagram)
            {
                count++;
                System.out.println("prime+Anagram"+i);
                for(int j=0;j<200;j++)
                {
                    a[j]=i;
                }
            }
        }

    }
    public static boolean isPrime(int no)
    {
        for(int i=2;i<=Math.sqrt(no);i++)
        {
            if(no%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram(int no)
    {
        int temp=no;
        int rev=0;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(no==rev)
        {
            return true;
        }
        else {
            return false;
        }

    }
}
