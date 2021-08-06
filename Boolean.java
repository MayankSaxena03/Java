import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Boolean is a variable that can be either true or false

        //Declaring boolean
        boolean a = true ;
        
        //Program Example to check if user is eligible to vote
        System.out.print("Enter your age : ");
        int i = scan.nextInt();
        a = (i>=18); //a is true if age is greater than or equal to 18 and false when age is less than 18
        if(a) {
            System.out.println("Eligible to vote"); //This runs when a is true
        } else {
            System.out.println("Not eligible to vote"); //This runs when a is false
        }
        scan.close();
    }
}
