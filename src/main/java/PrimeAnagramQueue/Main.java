package PrimeAnagramQueue;

import PrimeAnagramStack.isAnagram;
import PrimeAnagramStack.isPrime;
import PrimeAnagramStack.Queue;

public class Main {
    public static void main(String[] args) {
        Queue q=new Queue();
        for(int i=0;i<1000;i++)
        {
            boolean p = isPrime.isP(i);
            boolean a = isAnagram.isA(i);
            if(a && p)
            {
                q.push(i);
            }
        }
        q.show();



    }
}
