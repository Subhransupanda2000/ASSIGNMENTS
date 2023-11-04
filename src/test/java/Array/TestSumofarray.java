package Array;

import Array.ArraySum;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestSumofarray {

    @Test
    public void testSumArrays() {
        ArraySum arraySum = new ArraySum();

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expected = {5, 7, 9};

        int[] result = arraySum.sumArrays(array1, array2);
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumArraysWithDifferentLengths() {
        ArraySum arraySum = new ArraySum();

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7}; // Arrays with different lengths

        arraySum.sumArrays(array1, array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumArraysWithNullArray() {
        ArraySum arraySum = new ArraySum();

        int[] array1 = {1, 2, 3};
        int[] array2 = null; // Null array

        arraySum.sumArrays(array1, array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumArraysWithEmptyArrays() {
        ArraySum arraySum = new ArraySum();

        int[] array1 = {};
        int[] array2 = {}; // Empty arrays

        arraySum.sumArrays(array1, array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumArraysWithDifferentArrayTypes() {
        ArraySum arraySum = new ArraySum();

        int[] array1 = {1, 2, 3};
        double[] array2 = {1.2, 1.3, 1.4};// Arrays with different data types

        arraySum.sumArrays(array1, array2);

    }
}

