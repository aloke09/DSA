package Bubble;

import java.util.ArrayList;
import java.util.List;

public class Bubblesort
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(7);
        list.add(2);
        bSort(list);

    }
    public static void bSort(List<Integer> list)
    {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for(int t:list)
        {
            System.out.println(t);
        }
    }
}
