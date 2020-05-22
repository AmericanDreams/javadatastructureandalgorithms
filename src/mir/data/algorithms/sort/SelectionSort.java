package mir.data.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,44,0,-1,345,33,-1,23,-1,123,44};
        print(sort(array));
    }

    public static int[] sort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            int biggest = 0;
            for (int j = 1; j <= i; j++) {
                if (array[biggest] < array[j]) {
                    biggest = j;
                }
            }

            int temp = array[i];
            array[i] = array[biggest];
            array[biggest] = temp;
        }

        return array;
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
