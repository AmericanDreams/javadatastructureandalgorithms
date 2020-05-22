package mir.data.datastructures.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Item 1");
        list.add(1, "Item 2");
        list.addAll(new ArrayList<>());
        list.addAll(1, new ArrayList<>());

        //list.clear();

        //list.clone()

        System.out.println(list.contains("Item 1"));

        list.ensureCapacity(25);

        System.out.println(list.equals(new ArrayList<>()));

        System.out.println(list.isEmpty());



        System.out.println(list.hashCode());

        //list.removeAll(new ArrayList<>());
        //list.retainAll(new ArrayList<>());
        /**
        * Difference between retainAll and removeAll is :
        * removeAll method remove items which are exist in passed list from actualList
        * retainAll remove all items from list except which are exists in passed link from actual link
        * */



        list.toArray();
        list.toArray(new String[20]);
        /**
         * Difference between these 2 methods (toArray() and toArray(array)) is that :
         * If we dont send array as a argument it will create an array and send us back which includes all items of list , orderly.
         * When we send an array there it first cheks if passed array length bigger or equal than size of list it store all items
         * of list , orderly , into this passed array and send back us. If it is not it again create new array and send us back;
         *
         * Keep in your mind !
         * If passed array has a items it will override them with items of list.
         * */

        String[] myArray = new String[5];
        myArray[2] = "Array Item";
        System.out.println("myarray " + Arrays.toString(myArray));

        System.out.println(list.size());

        list.toArray(myArray);
        System.out.println("myarray " + Arrays.toString(myArray));


        list.trimToSize();








    }
}
