public class Recursion {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 6, 10};

        System.out.println(sumInRecursion(arrayOfNumbers, 0));
        System.out.println(itemCount(arrayOfNumbers, 0));
        System.out.println(highestNumber(arrayOfNumbers, 0));
    }

    private static int sumInRecursion(int[] array, int i){
        if (i >= array.length) {
            return 0;
        }

        return array[i] + sumInRecursion(array, i + 1);
    }

    private static int itemCount(int[] array, int i){
        if (i >= array.length) {
            return 0;
        }

        return 1 + itemCount(array, i + 1);
    }

    private static int highestNumber(int[] array, int i){
        if (i >= array.length) {
            return Integer.MIN_VALUE;
        }

        int higherOfRemaining = highestNumber(array, i + 1);

        return Math.max(array[i], higherOfRemaining);
    }
}
