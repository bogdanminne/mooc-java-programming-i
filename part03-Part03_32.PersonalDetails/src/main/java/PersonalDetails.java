
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int holder = 0;
        int counter = 0;


        while (true) {
            String namesAndBirthYears = scanner.nextLine();

            if (namesAndBirthYears.equals("")) {
                break;
            }

            String[] splitnamesAndBirthYears = namesAndBirthYears.split(",");

            String name = splitnamesAndBirthYears[0];

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            holder += Integer.valueOf(splitnamesAndBirthYears[1]);
            counter += 1;
            
            
        }

        System.out.println("Longest name: " + longestName);

        System.out.println("Average of the birth years: " + (1.0 * holder / counter));


    }
}
