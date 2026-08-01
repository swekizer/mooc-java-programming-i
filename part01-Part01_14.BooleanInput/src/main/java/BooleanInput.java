
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        String n = scanner.nextLine();
        boolean temp = Boolean.valueOf(n);
        System.out.println("True or false? " + temp);
    }
}
