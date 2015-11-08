import java.util.Random;

public class Sorting {
    private static int array[];
    private static int length;
    private static int size =  1000;
    private static int max_value = 1000;

    public static void main(String[] args) {
        // int array[] = {3, 5, 3, 2, 56, 7, 3, 55, 64,67,3,756,23,3,2,44,3,34,434,23,2,3,23,4,3,4,5,4,6,65,5,98,5475,6,456,87,4,534,34,3, 8,65,45,34,76,887,76,55,44,33,3,599,78,343,88, 5, 4, 6, 3, 23, 76, 5, 45, 3, 8567, 53, 43, 46, 3, 453, 45, 34, 322, 6, 8, 8, 4, 9, 22, 21, 8, 45, 32};

        array= new int[size];

        System.out.println("O(n) = " + size);
        System.out.println("O(n*n) = " + size * size);

        DSBubbleSort bubble = new DSBubbleSort();
        fillArrayWithRandom();
        p("\nBefore bubble Sort ");
        printArray(array);
        bubble.sort(array);
        p("\nAfter bubble Sort  ");
        printArray(array);

        DSSelectionSort sel_sort = new DSSelectionSort();
        fillArrayWithRandom();
        p("\nBefore selection Sort ");
        printArray(array);
        sel_sort.sort(array);
        p("\nAfter selection Sort  ");
        printArray(array);

        DSMergeSort merge_sort = new DSMergeSort();
        fillArrayWithRandom();
        p("\nBefore Merge Sort ");
        printArray(array);
        merge_sort.mergeSort(array);
        p("\nAfter Merge Sort  ");
        printArray(array);

        DSQuickSort qsort = new DSQuickSort();
        fillArrayWithRandom();
        p("\nBefore quick Sort ");
        printArray(array);
        qsort.sort(array);
        p("\nAfter quick Sort  ");
        printArray(array);



    }

    public static void p(String str) {
        System.out.print(str);
    }

    public static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(String.format("%d,", i));
        }
    }

    public static void fillArrayWithRandom() {
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(max_value);
        }
    }

}
