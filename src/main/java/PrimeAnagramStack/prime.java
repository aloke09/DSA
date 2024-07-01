package PrimeAnagramStack;

public class prime {
    public static boolean p(int no)
    {
        int count=0;
        int []a=new int [200];
        for(int i=7;i<no;i++)
        {
            boolean prime = isPrime.isP(i);
            boolean anagram = isAnagram.isA(i);
            if(prime && anagram)
            {

                return true;
            }
        }
        return false;
    }
}
