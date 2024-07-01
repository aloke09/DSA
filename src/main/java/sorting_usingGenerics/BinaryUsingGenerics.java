package sorting_usingGenerics;

public class BinaryUsingGenerics
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};

        int intIndex = binarySearch(intArray, 5);
        int stringIndex = binarySearch(stringArray, "date");

        System.out.println("Index of 5 in intArray: " + intIndex);
        System.out.println("Index of 'date' in stringArray: " + stringIndex);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = key.compareTo(array[mid]);//0,1,-1

            if (cmp < 0) {
                high = mid - 1;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // key not found
    }
}
