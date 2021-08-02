import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        //Loop within loop is nested loop
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = scan.nextInt();
        System.out.print("Enter number of colums : ");
        int column = scan.nextInt();
        //Nested Loop to print filled rectangle of given row and column
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < column; j++) {
                System.out.print(" * ");
            }
            System.out.println(""); //Line Break
        }
        scan.close();//Closing the scanner
        //Refer MultiDimensionArrays file 
    }
}
