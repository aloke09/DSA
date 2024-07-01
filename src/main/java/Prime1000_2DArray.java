import java.util.ArrayList;
import java.util.Arrays;

public class Prime1000_2DArray
{
    static ArrayList<Integer>al=new ArrayList<>();
    public static void main(String[] args)
    {
        int []prime = prime(1000);
        System.out.println(Arrays.toString(prime));
    }
    public static int[] prime(int no)
    {
        int count=0;
        int [][]arr=new int[2][100];
        int []a=new int [200];
        for(int i=7;i<no;i++)
        {
            boolean prime = isPrime(i);
            if(prime)
            {
                count++;
                System.out.println("prime"+i);
                for(int j=0;j<200;j++)
                {
                    a[j]=i;
                }
            }
        }
        return a;
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
    public static void insertInto2DArray(int no)
    {

    }
}
