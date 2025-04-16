
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number: ");
        String number1String = scanner.nextLine();
        System.out.println("Give the second number: ");
        String number2String = scanner.nextLine();

        int number1 = Integer.valueOf(number1String);
        int number2 = Integer.valueOf(number2String);

        System.out.println(number1String + " + " + number2String + " = " + (number1 + number2));


    }
}
