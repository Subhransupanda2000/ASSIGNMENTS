public class ArrayUtils {

    public static int[] removeElement(int[] arr, int elementToRemove) {
        int newSize = arr.length - 1;
        int[] result = new int[newSize];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                result[j++] = arr[i];
            }
        }

        return result;
    }
}
