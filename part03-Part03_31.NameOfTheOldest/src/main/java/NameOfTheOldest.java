
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOldest = "";
        int oldest = 0;

        while (true) { 
            String namesAndAges = scanner.nextLine();

            if (namesAndAges.equals("")) {
                break;
            }

            String[] splitNamesAndAges = namesAndAges.split(",");

            if (Integer.valueOf(splitNamesAndAges[1]) > oldest) {
                oldest = Integer.valueOf(splitNamesAndAges[1]);
                nameOldest = splitNamesAndAges[0];
            }
        }

        System.out.println(nameOldest);


    }
}
