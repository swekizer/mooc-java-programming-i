
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write your program here
//        System.out.println("Where to?");
//        int n = Integer.valueOf(scanner.nextLine());
//        
//        for(int i=1; i<= n; i++){
//            System.out.println(i);
//        }
        
        System.out.println("Where to?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int end = Integer.valueOf(scanner.nextLine());
        
        while(end <= start){
            System.out.println(end);
            end += 1;
        }

    }
}
