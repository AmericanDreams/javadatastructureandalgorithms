package mir.data.algorithms.sort;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = new int[]{0,3,23,-2,345,10,22,32,87,9,6,0,4};
        print(sort(array));
    }

    public static int[] sort(int[] array) {

       for (int gap = array.length / 2; gap > 0; gap /= 2) {
           for (int i = gap; i < array.length; i++) {
               int item = array[i];
               int j = i - gap;
               while (j >= 0 && item < array[j]) {
                   array[j + gap] = array[j];
                   j = j - gap;
               }
               array[j + gap] = item;

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
