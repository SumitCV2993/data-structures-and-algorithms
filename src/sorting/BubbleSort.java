package sorting;

public class BubbleSort {

    public static void bubbleSort(int[] unSortedArray) {
        System.out.println("Unsorted Array");
        for (int arr : unSortedArray)
            System.out.print(arr);
        int size = unSortedArray.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size -i - 1; j++) {
                if (unSortedArray[j] > unSortedArray[j + 1]) {
                    temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j + 1];
                    unSortedArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array");
        for (int arr : unSortedArray)
            System.out.print(arr);
    }

}
