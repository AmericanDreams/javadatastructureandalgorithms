package mir.data.datastructures.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("ITEM 1");
        System.out.println(stack.peek());
        System.out.println(stack.pop());


    }
}
