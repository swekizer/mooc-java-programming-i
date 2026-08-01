
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        String n = scan.nextLine();
        int temp = Integer.valueOf(n);
        System.out.println("Give a double:");
        String t = scan.nextLine();
        double d = Double.valueOf(t);
        System.out.println("Give a boolean:");
        String p = scan.nextLine();
        boolean b = Boolean.valueOf(p);
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + temp);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);
    }
}
