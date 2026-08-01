
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scan.nextLine());

        if(amount < 5000){
            System.out.println("No tax!");
        } else if(amount >= 5000 && amount < 25000){
            int tax = amount - 5000;
            if(tax >= 0){
                double result = (double) 0.08 * tax;
                result = result + 100;
                System.out.println("Tax: " + result);
            } else{
                System.out.println("Tax: " + 100.0);
            }
        } else if(amount >= 25000 && amount < 55000){
            int tax = amount - 25000;
            if(tax >= 0){
                double result = (double) 0.1*tax;
                result = result + 1700;
                System.out.println("Tax: " + result);
            } else{
                System.out.println("Tax: " + 1700);
            }
        } else if(amount >= 55000 && amount < 200000){
            int tax = amount - 55000;
            if(tax >= 0){
                double result = (double) 0.12*tax;
                result = result + 4700;
                System.out.println("Tax: " + result);
            } else{
                System.out.println("Tax: " + 4700);
            }
        } else if(amount >= 200000 && amount < 1000000){
            int tax = amount - 200000;
            if(tax >= 0){
                double result = (double) 0.15*tax;
                result = result + 22100;
                System.out.println("Tax: " + result);
            } else{
                System.out.println("Tax: " + 22100);
            }
        } else if(amount >= 1000000){
            int tax = amount - 1000000;
            if(tax >= 0){
                double result = (double) 0.17*tax;
                result = result + 142100;
                System.out.println("Tax: " + result);
            } else{
                System.out.println("Tax: " + 142100);
            }
        }
    }
}
