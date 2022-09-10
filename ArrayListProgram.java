import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args) {
        //Simple Array
        //fixed size and only 1 data type
        String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		fruits[3] = "Watermelon";
		System.out.println(fruits[0]);
        
        //ArrayList
        //Variable size and multiple data types supported
        //You can use ArrayList fruitList = new ArrayList(); instead of the line below
		ArrayList<Object> fruitList = new ArrayList<Object>(); //Declaring Array List that support all data types
        //Adding items in list
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
        fruitList.add(1);
        fruitList.add(99990239203L);

		System.out.println(fruitList); //Will print fruit list
        fruitList.remove("Strawberry"); //Will remove strawberry from the list
        System.out.println(fruitList);
		System.out.println(fruitList.contains("Raspberry")); //will check if list contains raspberry or not
        fruitList.set(3, "Not Strawberry"); //will set the value on index 3
        System.out.println(fruitList);
        System.out.println(fruitList.get(2)); //will get the value at index 2
        fruitList.clear(); //will clear list
		System.out.println(fruitList);

        //Array List of single data type
        ArrayList<String> foodList = new ArrayList<String>();
        foodList.add("Burger");
        foodList.add("Pizza");
        foodList.add("Fries");
        System.out.println(foodList);
        
        Collections.sort(foodList); //Sort arrayList
        System.out.println(foodList);
    }
}
