public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2, 10};
        selectionSort(array);

        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int[] selectionSort(int[] array){
        
        for (int i = 0; i < array.length -1; i++) {

            int indexOfSmaller = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfSmaller]) {
                    indexOfSmaller = j;
                }
            }

            int temp = array[indexOfSmaller];
            array[indexOfSmaller] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
