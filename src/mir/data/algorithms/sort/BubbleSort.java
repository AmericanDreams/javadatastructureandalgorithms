package mir.data.algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{0,3,23,-2,345,10,22,32,87,9,6,0};
        print(sort(array));
    }

    public static int[] sort(int[] array) {
        int swap = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) { //If it would be >= this algorthm will be Unstable
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swap++;
                }
            }
        }

        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
