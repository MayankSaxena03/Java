import java.util.Scanner;

public class NullPointerExceptionFix {
    public static void main(String[] args) {
        String a = ""; //Declaring an empty string
        System.out.println(a.length()); //This will run because a has empty string in it (a holds an empty string or a reference to an empty string.)
        String b = null;
        //System.out.println(a.length()); This will show error because b has nothing in it (b is null or it is referencing to null)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = scan.nextInt();
        Scanner scan2 = null;
        //int j = scan2.nextInt(); This will show error because the scan2 object has nothing in it. (scan2 is referencing to null)

        /*
            To fix null pointer exception look for the line on which exception occured. 
            If the code on line is correct look for the object on which operation is occured on that line.
        */
    }
}
