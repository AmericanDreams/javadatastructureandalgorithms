package mir.data.algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{4,3,2,7};
        print(sort(array));

    }

    public static int[] sort(int[] array) {

        send (array,0,array.length);

        return array;
    }

    private static void send(int[] array, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int pivit = array[start];
        int s = start ;
        int e = end - 1;

       while (s <= e) {
           if (array[e] < pivit) {
               array[s] = array[e];
               s++;
               if (array[s] > pivit) {
                   array[e] = array[s];
               }
           }
       }

        array[s] = pivit;


    }


    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
