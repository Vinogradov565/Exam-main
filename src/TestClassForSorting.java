import java.util.Arrays;
import java.util.Random;

public class TestClassForSorting {

    public static int[] array = new int[10];

    public static void main(String[] args) {
        fillArray(array);
        int[] sortedArray = sortArray(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) - 25;
        }
    }

    private static int[] sortArray(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (sortedArray[j] < sortedArray[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }

        return sortedArray;
    }
}
