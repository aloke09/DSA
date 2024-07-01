package sorting_usingGenerics;

public class BubbleSortUsingGenerics
{
    public static void main(String[] args)
    {
        Integer[] intArray = { 5, 6, 7,1, 2, 3, 4, 8, 9, 10};
        System.out.println("before sorting->");
        for(Integer temp:intArray)
        {
            System.out.print(temp+" ");
        }
        System.out.println("\nAfter insertion Sort->");
        bubbleShortGen(intArray);
        for(Integer temp:intArray)
        {
            System.out.print(temp+" ");
        }
    }
    public static <T extends Comparable<T>> void bubbleShortGen(T[] arr)
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)//i minus because no need to sort the sorted array
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
