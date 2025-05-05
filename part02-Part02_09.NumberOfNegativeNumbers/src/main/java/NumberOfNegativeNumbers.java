
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {

            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                count += 1;
            }

        
        }

        System.out.println("Number of negative numbers: " + count);

    }
}
