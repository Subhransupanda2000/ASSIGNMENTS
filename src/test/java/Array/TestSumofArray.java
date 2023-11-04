package Array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSumofArray {
    @Test
    public void testArraySum() {

        int[] array1 = {1, 2, 3,};
        int[] array2 = {1, 2, 3};
        int[] expected = {2, 4, 6};
        int[] result = ArraySum.sumArrays(array1, array2);
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testexception() {
        int[] array1 = {1, 2};
        int[] array2 = {1, 2, 3};
        ArraySum.sumArrays(array1, array2);


    }
}

