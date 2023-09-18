public class MinMaxInArray {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 9, 4, 5, 2, 8, 6, 7};

        // Initialize variables to store minimum and maximum values
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find the minimum and maximum values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the minimum and maximum values
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
