
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String strings = "";


        while (true) {
            String temp = scanner.nextLine();
            
            strings += temp + " ";
            

            if (temp.equals("")) {break;}

            

        }

        String[] pieces = strings.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
        
     
    }
}
