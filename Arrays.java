import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Method to declare array and initialize it at the same time
        int[] a = {15, 18, 21, 24, 27, 30}; //Declaring and initializing integer array
        System.out.println(a[0] + a[2] + a[4]);   
        
        //Method to declare array and initialize it later
        int[] b = new int[5]; //Declaring an array of size 5
        int i=0;
        while(i<5) {
            System.out.print("Enter element " + (i+1) + " : " );
            b[i] = scan.nextInt();
            i++;
        }
        i=0; //Making i=0 again to display array values
        while(i<5) {
            System.out.println("Element " + (i+1)+ " = " + b[i] );
            i++;
        }
        
        //Above methods can be used for different types of arrays of different data types.
    }
}
