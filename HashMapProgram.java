import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args) {
        /* Maps are used for when you want to associate a key with a value and Lists are an ordered collection. 
        Map is an interface in the Java Collection Framework and a HashMap is one implementation of the Map interface. 
        HashMap are efficient for locating a value based on a key and inserting and deleting values based on a key. */
        
        //Syntax of declaring : HashMap<Key Type, Value Type> name = new HashMap<Key Type, Value Type>()
        HashMap<String , Integer> numbers = new HashMap<String, Integer>(); 
        numbers.put("a", 1);
        numbers.put("b",2);
        numbers.put("c",3);
        System.out.println(numbers); //will print keys and values
        System.out.println(numbers.get("b")); //will print value at key "b"

        //keys and values can be of any data type
        
        //Creating hashmap with string value type
        HashMap<String , String> namePassword = new HashMap<String , String>();
        //Storing values in keys
        namePassword.put("abcdef@xyz.com","12345678");
        namePassword.put("mnop@xyz.com", "24680246");
        namePassword.put("qwerty@xyz.com","password123");
        System.out.println(namePassword); //will print keys and values
        System.out.println(namePassword.size()); //will print size of map
        namePassword.replace("mnop@xyz.com","510152025"); //will replace password of the given key
        System.out.println(namePassword); //will print after replacing value
        System.out.println(namePassword.containsKey("qwert@xyz.com")); //will check if key is present in map
        System.out.println(namePassword.containsValue("12345678")); //will check if value is present in map
        System.out.println(namePassword.keySet()); //will print all keys
        System.out.println(namePassword.values()); //will print all values
        namePassword.remove("abcdef@xyz.com");
        System.out.println(namePassword); //will print after removing key
    }
}
