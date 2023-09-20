
import Array.MergeArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MergeArrayTest {

    @Test
    public void testMergeArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = MergeArray.mergeArrays(arr1, arr2);

        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, result);
    }


}

