package Array;
public class MergeArray {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] mergedArray = new int[size1 + size2];

        // Copy elements from arr1
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        return mergedArray;
    }
}
