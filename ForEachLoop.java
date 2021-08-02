import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
            For Each Loop provides an alternative approach to traverse the array or collection in Java. 
            It is mainly used to traverse the array or collection elements. 
            It is known as the for-each loop because it traverses each element one by one.
        */
        String[] cars = {"BMW","Mercedes","Audi","Tesla"};
        
        //With for loop (Refer ForLoop.java)
        for(int i = 0; i<4; i++) {
            System.out.print(cars[i]+" ");
        }
        
        System.out.println("\n-----------------------------------"); //Line Break

        //With ForEachLoop
        //for each loop will set the value of car every time till loop run and loop wwill run until it reaches the end of array or array list 
        for(String car : cars) {
            System.out.print(car+" ");
        }

        System.out.println("\n-----------------------------------"); //Line Break

        //Integer example with Array List
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for(int num : numbers) {
            System.out.print(num+" ");
        }
    }
}
