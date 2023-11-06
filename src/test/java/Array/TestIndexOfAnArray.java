package Array;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestIndexOfAnArray {

    @Test
    public void testIndexOfAnArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        int expected = 6;

        int result = IndexOfAnElement.indexOfAnArray(arr, target);

        assertEquals(expected, result);
    }
}
