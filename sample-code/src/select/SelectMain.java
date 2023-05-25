package select;

public class SelectMain {

    private static int[] array = {10, 9, 5, 4, 3, 2, 1, 7, 6};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp(i, j);
                        printArrayStatus(array[i], array[j]);
                    }
                }
            }
    }

    private static void temp(int first, int last) {
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }

    private static void printArrayStatus(int i, int j) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println(" : Change "+i+" and "+j);
    }
}
