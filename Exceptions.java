import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        /*An exception is an event, which occurs during the execution of a program, 
        that disrupts the normal flow of the program's instructions. When an error 
        occurs within a method, the method creates an object and hands it off to the 
        runtime system. ... This block of code is called an exception handler.*/

        //Below written code is supposed to show error while compiling.
        ArrayList<String> pets = new ArrayList<String>();
        pets.add("Cat");
        pets.add("Dog");
        System.out.println(pets.get(2)); //This will show error because there is no index 2 as our list will only have values at index 0,1

        //Reading the exception will help finding the errors and can be used for debugging.
    }
}
