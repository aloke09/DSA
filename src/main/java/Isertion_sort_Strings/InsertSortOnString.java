package Isertion_sort_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertSortOnString
{
    public static void main(String[] args)
    {
        ArrayList<String>al=new ArrayList<>(Arrays.asList("apple", "banana","mango","orange","kiwi"));
        String[] array = al.toArray(new String[0]);
        insort(array);
    }
    public static void insort(String[] arr)
    {
        int len= arr.length;
        for (int i = 1; i < len; ++i)
        {
            String str=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareTo(str) > 0)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = str;
        }
        for(String temp:arr)
        {
            System.out.println(temp);
        }
    }
}
