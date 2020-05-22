package mir.data.algorithms.sort;

public class InsertionSort {

    public static void main(String[] args) {
        //int[] array = new int[]{0,3,23,-2,345,10,22,32,87,9,6,0};
        int[] array = new int[]{987,678,45,34,23,12,9,6,5,3,2,1};
        print(sort(array));
    }


    private static int[] sort(int[] array) {
        int swap = 1;
        for (int i = 1; i < array.length; i++) {
            int item = array[i];
            int j;
            for (j = i - 1; j >= 0 && item < array[j]; j--) {
                array[j+1] = array[j];
                swap++;
            }
            array[j + 1] = item;
            swap++;
        }
        System.out.println("swap " + swap);

        return array;
    }



    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}