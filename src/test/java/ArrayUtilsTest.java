import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilsTest {

    @Test
    public void testRemoveElement() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        int[] result = ArrayUtils.removeElement(originalArray, elementToRemove);

        int[] expected = {1, 2, 4, 5};
        assertArrayEquals(expected, result);
    }


    }

