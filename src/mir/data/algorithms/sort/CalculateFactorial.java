package mir.data.algorithms.sort;

public class CalculateFactorial {

    public static void main(String[] args) {
        int number  = 6;
        System.out.println("Factorial " + number + " = " + calculateFactorialOfNumber(number));
    }

    private static int calculateFactorialOfNumber (int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * calculateFactorialOfNumber(number - 1);
        }
    }
}
