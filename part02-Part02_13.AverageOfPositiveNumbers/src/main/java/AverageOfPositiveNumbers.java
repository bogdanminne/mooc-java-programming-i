
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numberOfNumbers = 0;
        float sum = 0;

        while (true) { 
         
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (number > 0) {
                numberOfNumbers += 1;
                sum += number;

            }
        }

        float average = sum / numberOfNumbers;

        System.out.println(average);

    }
}
