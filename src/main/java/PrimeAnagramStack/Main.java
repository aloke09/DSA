package PrimeAnagramStack;

import PrimeAnagramQueue.stack;

public class Main
{
    public static void main(String[] args) {
        stack s=new stack();
        for(int i=0;i<1000;i++)
        {
            boolean p = isPrime.isP(i);
            boolean a = isAnagram.isA(i);
            if(a && p)
            {
                s.push(i);
            }
        }
        s.show();



    }
}
