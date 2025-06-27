
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String namesAndAges = scanner.nextLine();

            if (namesAndAges.equals("")) {
                break;
            }

            String[] splitNamesAndAges = namesAndAges.split(",");

            if (Integer.valueOf(splitNamesAndAges[1]) > oldest) {
                oldest = Integer.valueOf(splitNamesAndAges[1]);
            }

            
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
