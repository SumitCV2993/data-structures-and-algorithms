package sorting;

public class SelectionSort {

    public static void selectionSort(int[] unSortedArray) {

        int size = unSortedArray.length;

        System.out.println("Unsorted Array");

        for (int arr : unSortedArray)
            System.out.print(arr+ ",");
        System.out.println();
        /*for (int i = 0; i < size-1; i++) {
            int minIndex = -1;
            int minValue = unSortedArray[i];
            for (int j =i+1; j < size; j++) {
                if (minValue > unSortedArray[j]) {
                    minValue=unSortedArray[j];
                    minIndex = j;
                }
            }
            if (minIndex >=0) {
                int temp = unSortedArray[i];
                unSortedArray[i] = unSortedArray[minIndex];
                unSortedArray[minIndex]=temp;
            }

            for (int arr : unSortedArray)
                System.out.print(arr+",");
            System.out.println();
        }*/
        int minIndex = -1;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (unSortedArray[minIndex] > unSortedArray[j]) {
                    minIndex = j;
                }
            }

            int temp = unSortedArray[i];
            unSortedArray[i] = unSortedArray[minIndex];
            unSortedArray[minIndex] = temp;

        }

        System.out.println();
        System.out.println("Sorted Array");
        for (int arr : unSortedArray)
            System.out.print(arr + ",");
    }
}
