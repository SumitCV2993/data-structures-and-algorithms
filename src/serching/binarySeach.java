package serching;

public class binarySeach {
    public static int binarySerchWithRecusionResult(int[] inputArray, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (inputArray[mid] == target)
                return mid;
            else if (mid < target)
                return binarySerchWithRecusionResult(inputArray, target, mid + 1, right);
            else
                return binarySerchWithRecusionResult(inputArray, target, 0, mid - 1);
        }
        return -1;
    }




    public static int binarySerch(int[] inputArray, int target) {

        int startPoint = 0;
        int endPoint = inputArray.length - 1;

        while (startPoint <= endPoint) {

            int mid = (startPoint + endPoint) / 2;

            if (inputArray[mid] == target)
                return mid;
            else if (mid < target)
                startPoint = mid + 1;
            else
                endPoint = mid - 1;
        }
        return -1;
    }
}
