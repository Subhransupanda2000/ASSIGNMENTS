package Array;

public class IndexOfAnElement {
    public static int indexOfAnArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }
}
