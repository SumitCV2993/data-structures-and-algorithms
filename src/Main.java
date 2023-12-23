import static serching.binarySeach.*;
import static serching.lenearSearch.lenearSerch;
import static sorting.BubbleSort.bubbleSort;
import static sorting.SelectionSort.selectionSort;


public class Main {
    public static void main(String[] args) {


        //1 Serching
        //int inputArray[] = {1, 2, 3, 4, 5, 6};
        //int target = 5;
        //int lenearSerchResult = lenearSerch(inputArray, target);
        //int binarySerchResult = binarySerch(inputArray, target);
        //int binarySerchWithRecusionResult = binarySerchWithRecusionResult(inputArray, target, 0, inputArray.length - 1);
        //System.out.println("Lenear Sarch target found on index " + lenearSerchResult);
        //System.out.println("Binart Sarch target found on index " + binarySerchResult);
        //System.out.println("Binart Sarch with recursion target found on index " + binarySerchWithRecusionResult);

        //2 Sorting
        int unSortedArray[]={15,37,14,28,53};
        //2.1 Bubbole Sort
        //bubbleSort(unSortedArray);
        //2.2 Selection Sort
        selectionSort(unSortedArray);




    }




}