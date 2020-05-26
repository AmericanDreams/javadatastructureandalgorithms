package mir.data.datastructures.list;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        

        /**
         * What is the difference between add() and offer() method since both of them do same thing ?
         *
         * These 2 methods come from Queue interface. And Queue offers 2 decleration for adding element to end of the list.
         * 1 of them is add second one is offer.
         *
         * When we implement this we need to keep our mind that !
         * If the list capasity is full when we try to add element to list with add method it should throw Exception.
         * But if capasity is full and we try to add new element with offer we should return false.
         *
         * In temrs of LinkedList , Linkedlist has limitless capasity. That is why in this case they dont have any difference.
         * But in another class impkementation it can be different.
         *
         * */
        linkedList.add("Item 1");
        linkedList.offer("Item 1");



        /**
         * There is same stiuation here as well. element() and peek() methods of Queue return item from fromt of list.
         *
         * If the list is empty element() method should thorw Exception but peek() method should return null;
         *
         * */
        linkedList.element();
        linkedList.peek();


        /**
         * Same stiuation is here. remove() and poll() methods come from Queue interface which remove the first element from in front of
         * the list and return this removed element back.
         *
         * But if list is empty remove() method throw Exception but poll() method return null.
         * */
        linkedList.remove();
        linkedList.poll();


        /**
         * What is explained for Queue interface is also same for Deque interface.
         * add* , get*, remove* methods throw Exception when samething is wrong but
         * offer*, peek*, poll* method return boolean or null data.
         * */
        Deque<String> deque = linkedList;

        deque.addFirst("First");
        deque.offerFirst("Fist");
        deque.addLast("last");
        deque.offerLast("last");


        deque.getFirst();
        deque.peekFirst();
        deque.getLast();
        deque.peekLast();

        deque.removeFirst();
        deque.pollFirst();
        deque.removeLast();
        deque.pollLast();

        linkedList.add(1,"de");



    }
}
