package mir.data.algorithms.challanges;

import java.util.*;
import java.util.stream.Collectors;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPallandrome("Hey, yeh?"));

    }

    /**
     * This method check whether passed string is palindrome or not.
     * But important part is Method is not case sensitive and also ignaros spaces and punctuation marks.
     *
     * examples:
     * passed "Salas" should return true;
     * passed "Hey, yeh?" should return true;
     * */
    public static boolean isPallandrome(String string) {

        LinkedList<String> stack = createStackFromString(string);
        LinkedList<String> reverseStack = createStackFromString(new StringBuilder(string).reverse().toString());

        ListIterator<String> sIter = stack.listIterator();
        ListIterator<String> rIter = reverseStack.listIterator();
        int c = 1;
        int middleSize = stack.size() / 2;
        while (rIter.hasNext()) {
            if (c > middleSize) {
                break;
            }

            if (!rIter.next().equals(sIter.next())) {
                return false;
            }
            c++;
        }

        return true;
    }

    /**
     * This method will take all characters of String except spaces and punctuation marks and fill into the Stack then return it back
     * */
    private static LinkedList<String> createStackFromString(String str) {
        LinkedList<String> stack = new LinkedList<String>();
        for (char c : str.toCharArray()) {
            if (isAccessible(c)) {
                stack.push(String.valueOf(c).toLowerCase());
            }
        }
        return stack;
    }


    private static boolean isAccessible(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }
}
