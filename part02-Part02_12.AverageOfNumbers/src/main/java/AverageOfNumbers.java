
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numberOfNumbers = 0;
        float sum = 0;
        

        while (true) {
            
            System.out.print("Give a number: ");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            numberOfNumbers += 1;
            sum += number;

        }

        double average = sum / numberOfNumbers;

        System.out.println("Average of the numbers: " + average);

    }
}
