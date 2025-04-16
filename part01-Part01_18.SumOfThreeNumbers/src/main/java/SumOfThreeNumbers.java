
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Give the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Give the third number: ");
        int number3 = scanner.nextInt();
        int sum = number1 + number2 + number3;
        System.out.println("The sum of the numbers is " + sum);

    }
}
