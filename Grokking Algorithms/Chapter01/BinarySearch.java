public class BinarySearch {
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(listOfNumbers, 5));
    }

    private static int binarySearch(int[] list, int search) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end){
            int middle = (start + end) / 2;
            int guess = list[middle];

            if (guess == search) {
                return middle;
            } 
            if (guess > search) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
    }
        return -1;
    }
}