
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toPrint = 0;

        int number = scanner.nextInt();

        while (0 <= number) {

            System.out.println(toPrint);
            toPrint += 1;
            number -= 1;

        }
    }
}
