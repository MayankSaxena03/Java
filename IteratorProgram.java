import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {
    public static void main(String[] args) {
        /*
           An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
           It is called an "iterator" because "iterating" is the technical term for looping. 
        */

        //Let's take an example of ArrayList of string. You can refer ArrayListProgram.java to learn more about them
        ArrayList<String> cities = new ArrayList<String>(); 
        //Adding items
        cities.add("Bareilly");
        cities.add("Pune");
        cities.add("Bangalore");
        cities.add("New York");
        System.out.println(cities); //will print the list
        //To print every item of the loop you can use iterator
        Iterator<String> it = cities.iterator();
        //printing every item in list using while loop
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        
        //We can use iterator for list, hashmap and many more
    }
}
