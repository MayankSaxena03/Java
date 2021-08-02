import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        /*
            A queue is an ordered list of objects with its use limited to insert elements at the end of a list and deleting elements from the start of a list. 
            It follows the First-In-First-Out (FIFO) principle.  
            Objects are always inserted at the tail of the queue
        */

        //Declaring Queue
        Queue<String> colors = new LinkedList<String>();
        //Adding elements in Queue. 
        //The first added element will become the head of queue. In below case "Red" is the head of the Queue
        colors.add("Red"); 
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Violet");
        colors.add("Yellow");
        System.out.println(colors); //Display the Queue
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.peek()); //Display Head of Queue. In this case Red.
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.poll()); //will remove the head element (display it too) in queue and shift the second element to head. (Red in this case. Green Becomes the head element.)
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors); //Display the Queue after above operations.
        System.out.println("-----------------------------------------------------------"); //Line Break
        colors.poll(); //will remove the head of Queue. In this case it will remove Green and Blue becomes head. If Queue is empty it will return null. 
        //We can use .remove() instead of .poll() but it will return exception when Queue is empty
        System.out.println(colors); //Display the Queue after above operations.
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.peek()); //will show the head element on Queue ()
        //We can convert Queue to array using .toArray().
    }
}
