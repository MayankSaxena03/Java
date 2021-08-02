import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        //Refer Exceptions.java and TryCatch.java before this
        try {
            System.out.println(5/0); //Will throw exception / by zero
        } catch (Exception e) {
            System.out.println(e); //will show what exception occured
        } finally {
            System.out.println("This code is in finally, it alwayas runs"); //Code in finally will always run
        }

        System.out.println("------------------------------------------------------"); //Line Break
        
        Scanner scan = new Scanner(System.in);
        int a = 0;
        System.out.print("Enter a number : ");
        try {
            a = scan.nextInt();
        } catch (Exception e) {
            System.out.println(e); //will show what exception occured and will run if anything other than Integer is in the input
        } finally {
            System.out.println(a); //will show 0 if exception occirs else user input
            scan.close();  //It is good practice to close these streams
        }
    }
}
