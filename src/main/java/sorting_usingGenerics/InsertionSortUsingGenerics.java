package sorting_usingGenerics;

public class InsertionSortUsingGenerics
{
    public static void main(String[] args) {

        Integer[] intArray = { 5, 6, 7,1, 2, 3, 4, 8, 9, 10};
        System.out.println("before sorting->");
        for(Integer temp:intArray)
        {
            System.out.print(temp+" ");
        }
        System.out.println("\nAfter insertion Sort->");
        insertSortGen(intArray);
        for(Integer temp:intArray)
        {
            System.out.print(temp+" ");
        }
    }
    public static <T extends Comparable<T>> void insertSortGen(T[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            T temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareTo(temp)>0)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
