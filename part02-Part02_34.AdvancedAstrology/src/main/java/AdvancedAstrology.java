
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int x = 1;
        while (x <= number) {
            System.out.print("*");
            x++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int x = 1;
        while (x <= number) {
            System.out.print(" ");
            x++;
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int counter = size;
        for (int x = 1; x <= size; x++) {
            printSpaces(counter - 1);
            printStars(x);
            counter--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int counter = height;
        for (int x = 1; x <= height; x++) {
            printSpaces(counter - 1);
            printStars(x * 2 - 1);
            counter--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
