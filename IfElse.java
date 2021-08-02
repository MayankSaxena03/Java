import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Creating a scanner
        System.out.print("Enter your marks : ");
        int marks = scan.nextInt(); //Taking an integer input
        //Condition to be written in the brackets of if and else if
        //else condition is called if none of the condition is true
        //if-else statements can also be nested
        if (marks>90 && marks<=100) {
            System.out.println("Your Grade is A");
        } else if(marks>80 && marks<=90) {
            System.out.println("Your Grade is B");
        } else if(marks>70 && marks<=80) {
            System.out.println("Your Grade is C");
        } else if(marks>60 && marks<=70) {
            System.out.println("Your Grade is D");
        } else if(marks>0 && marks<=60) {
            System.out.println("Your Grade is E");
        } else {
            System.out.println("Number not in Range");
        }
    }
}
