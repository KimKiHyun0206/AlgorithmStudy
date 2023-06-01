package shell_sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int [] array = {33,10,2,4,20,35,12,3,71,54};
        System.out.println("Before: " + Arrays.toString(array));
        sort(array);
        System.out.println("After:  " + Arrays.toString(array));

    }
    public static void sort(int[] array) {
        int inner, outer;
        int temp;

        int gap = 1;

        while (gap <= array.length / 3) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (outer = gap; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > gap - 1 && array[inner - gap] >= temp) {
                    array[inner] = array[inner - gap];
                    inner -= gap;
                }
                array[inner] = temp;
            }
            gap = (gap - 1) / 3;
        }
    }
}