import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) {
        /*Java HashSet class is used to create a collection that uses a hash table for storage.
         It inherits the AbstractSet class and implements Set interface. ... 
         HashSet stores the elements by using a mechanism called hashing. 
         HashSet contains unique elements only. HashSet allows null value 
        */
        
        //Example will be of String set but you can use any data type

        //Creating string HashSet
        //Declaration : HashSet<Data Type> name = new HashSet<Data Type>();
        HashSet<String> aliens = new HashSet<String>();
        //Adding items in string hashset
        aliens.add("Heat Blast");
        aliens.add("Grey Matter");
        aliens.add("Ghost Freak");
        aliens.add("Four Arms");
        aliens.add("XLR8");
        aliens.add("Upgrade");

        System.out.println(aliens); //will print hashset
        aliens.remove("Heat Blast"); //Will remove the string frrom set
        System.out.println(aliens);

        //printing every item in HashSet
        Iterator<String> alienList = aliens.iterator(); //refer IteratorProgram.java
        while(alienList.hasNext()) {
            System.out.print(alienList.next()+"  ");
        }

        System.out.println(""); //Line Break

        //values of hashset can be stored in an array but in random order
        Object[] aliensArray = aliens.toArray();
        System.out.println(aliensArray[2]);
    }
}
