package mir.data.algorithms.sort;

public class OptimizedBubbleSortWithGap {

    public static void main(String[] args) {
        int[] array = new int[]{0,3,23,-2,345,10,22,32,87,9,6,0};
        //int[] array = new int[]{987,678,45,34,23,12,9,6,5,3,2,1};
        print(sort(array));
    }

    public static int[] sort(int[] array) {
        int swap = 1;
        for (int gap = array.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int j = i - gap;
                while (j >= 0 && array[j] > array[j + gap]) {
                    int temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                    j = j - gap;
                    System.out.println("swap " + swap);
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
