
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2 + ".");
        } else if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2 + ".");
        } else if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2 + ".");
        }

    }
}
