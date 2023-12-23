package serching;

public class lenearSearch {
    public static int lenearSerch(int[] inputArray, int target) {

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == target)
                return i;
        }
        return -1;
    }
}
