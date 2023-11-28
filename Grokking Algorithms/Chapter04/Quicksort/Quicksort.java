import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};


        System.out.println("Original Array:");
        printArray(array);
        Arrays.sort(array);
        System.out.println("\n Sorted Array:");
        printArray(array);
    }

    private static void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
