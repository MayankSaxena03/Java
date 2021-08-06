import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Refer NestedLoops file
        //Initializing array at the time of declaring
        //Declaring and initializing 3x3 array a
        int [][] a = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        //Displaying array
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(""); //Line Break
        }               

        //Way to enter values in 2D Array manually.
        //Declaring 3x3 array arr
        int[][] arr = new int[3][3];
        //Manually input values in array arr
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Enter element :  ");
                arr[i][j] = scan.nextInt();
            }
        } 
        //Displaying array
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(""); //Line break
        } 
        scan.close();
    }
}
