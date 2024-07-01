import java.util.Stack;

public class BalancedParanthesse
{
    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<Character>();
        String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/((4+3))";
        char[] charArray = str.toCharArray();
        for(char c:charArray)
        {
            if(c=='(')
            {
                s.push('(');
            }
            if(s.size()==0 && c==')')
            {
                System.out.println("Not Balanced");
                System.exit(0);
            }
            if(s.size()!=0 && c==')')
            {
                s.pop();
            }
        }
        boolean empty = s.isEmpty();
        if(empty)
        {
            System.out.println("Balanced");
        }
        else {
            System.out.println("not balanced");
        }

    }
}
