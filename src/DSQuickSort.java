/**
 * Created by vmohanar on 11/7/15.
 */

public class DSQuickSort {
    private static int array[];
    private static int length;

    public static void sort(int []input) {
        array = input;
        quickSort(0, array.length - 1);
    }

    public static void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low + (high - low) / 2];

        /**
         * In each iteration, we will identify a number from left side which
         * is greater then the pivot value, and also we will identify a number
         * from right side which is less then the pivot value. Once the search
         * is done, then we exchange both numbers.
         */
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (i < high) {
            quickSort(i, high);
        }
        if (low < j) {
            quickSort(low, j);
        }
    }

    public static void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
