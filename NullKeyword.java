import java.util.ArrayList;

public class NullKeyword {
    public static void main(String[] args) {
        /* null only works with strings and objects and not with primitive data type 
        because strings and objects reference to data while primitive data types store data directly. */

        String a = null; //a references to null
        //int b = null;   This won't work with primitive data types as they store values directly
        ArrayList c = null;
        //The code below will compile because a is null
        if(a == null) {
            System.out.println("String is null");
        }
        //Below commented code will show null pointer exception because we are running a method on object which is null
        /*
            if(a.equals(null)) {
                System.out.println("String is null");
            }
        */    
    }
}
