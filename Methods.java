import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //To explain methods let's make calculator program
        Scanner scan = new Scanner(System.in);
        
        //Taking inputs
        System.out.print("Enter first number : ");
        double a = scan.nextDouble();
        System.out.print("Enter second number : ");
        double b = scan.nextDouble();
        
        //Calling Methods
        //Parameters are passed in bracket
        add(a,b);
        subtract(a,b);
        multiplty(a,b);
        divide(a,b);

        scan.close();
    }

    //Methods
    public static void add(Double a, Double b) {
        System.out.println("Addition = "+(a+b));
    }
    public static void subtract(Double a, Double b) {
        System.out.println("Subtraction = "+(a-b));
    }
    public static void multiplty(Double a, Double b) {
        System.out.println("Multiplication = "+(a*b));
    }
    public static void divide(Double a, Double b) {
        System.out.println("Division = "+(a/b));
    }
}
