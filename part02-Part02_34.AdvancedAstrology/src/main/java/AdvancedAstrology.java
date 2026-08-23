
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }    
    
    public static void printSpaces(int number) {
        // part 1 of the exercise
        while(number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int rows = size-1;//3
        int cols = 1;//1
        
        while(size >= cols){
            printSpaces(rows);//3,2,1,0
            printStars(cols);//1,2,3,4
            rows--;
            cols++;
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int rows = height -1;
        int cols =1;
        
        while(rows >= 0){
            printSpaces(rows);
            printStars(cols);
            rows--;
            cols+= 2;
        }
        int baseRows = 2;
        while(baseRows > 0){
            printSpaces(height - 2);
            printStars(3);
            baseRows--;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
