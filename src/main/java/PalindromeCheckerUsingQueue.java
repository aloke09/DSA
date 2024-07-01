import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerUsingQueue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String value:-");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        Deque<Character> d=new ArrayDeque<>();
        d.addLast(charArray[0]);
        for(int i=1;i<charArray.length;i++)
        {
            d.addFirst(charArray[i]);
        }
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]==d.peek())
            {
                d.removeFirst();
                continue;
            }
        }
        if(d.isEmpty())
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
