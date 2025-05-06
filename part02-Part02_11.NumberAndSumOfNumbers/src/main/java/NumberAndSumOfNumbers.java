
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sum = 0;

        while (true) { 
            
            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numberOfNumbers += 1;
            sum += number;

        }

        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
