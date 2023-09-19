import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index = 1;
        int elementToInsert = 4;
        if (index >= 0 && index < arr.length) {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = elementToInsert;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        } else {
            System.out.println("Index out of range.");
        }
        System.out.print("Modified Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
