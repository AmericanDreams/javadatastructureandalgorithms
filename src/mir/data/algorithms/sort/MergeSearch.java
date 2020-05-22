package mir.data.algorithms.sort;

import java.util.Arrays;

public class MergeSearch {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,44,0,-1,345,33,-1,23,-1,123,44};
        print(sort(array));

    }

    public static int[] sort(int[] array) {

       split(array, 0, array.length);

        return array;
    }

    public static void split(int[] array, int start, int end) {


        if ((end - start) == 1) {
            return;
        }
        int mid = (end + start) / 2;


        //split left
        split(array, start,  mid);
        //split right
        split(array,  mid, end);

        int[] leftArray = Arrays.copyOfRange(array, start, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, end);

        int l = start;
        int r = mid;
        int c = 0;


        int[] newArray = new int[end-start];

        while (l < mid && r < end) {
            newArray[c] = array[l] >= array[r] ? array[r++] : array[l++];
            c++;
        }

        for (int i = l; i < mid; i++) {
            newArray[c] = array[l++];
            c++;
        }

        for (int i = r; i < end; i++) {
            newArray[c] = array[r++];
            c++;
        }

        int dip = 0;
        for (int i = start; i < end; i++){
            array[i] = newArray[dip];
            dip++;
        }

    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
