package sorting_usingGenerics;

import java.lang.reflect.Array;

public class MergeSortUsingGenerics
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
        MergeSortGen(intArray,0, intArray.length-1);
        for(Integer temp:intArray)
        {
            System.out.print(temp+" ");
        }
    }
    public static <T extends Comparable<T>> void MergeSortGen(T[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            MergeSortGen(arr,l,mid);
            MergeSortGen(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temp arrays
        @SuppressWarnings("unchecked")
        T[] leftArray = (T[]) Array.newInstance(arr.getClass().getComponentType(), n1);
        @SuppressWarnings("unchecked")
        T[] rightArray = (T[]) Array.newInstance(arr.getClass().getComponentType(), n2);


        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays

        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
