import java.util.Stack;

public class LearnStacks {
    public static void main(String[] args) {
        /* 
            The Stack data structure is based on the Last In First Out (LIFO) principle and in Java, it implements the Java List interface. 
            The basic operations supported by a stack are push and pop. 
            Push adds an element at the top of a stack. 
            Pop removes the topmost element of a stack.
        */

        //Declaring Stack
        Stack<String> colors = new Stack<String>();
        //Adding elements in stack. 
        //We can use .add() method to add elements in stack but it is not standard syntax to use in Stack. It works same as .push()
        colors.push("Red");
        colors.push("Green");
        colors.push("Blue");
        colors.push("Orange");
        colors.push("Violet");
        colors.push("Yellow");
        //We have pushed colors in Stack and Yellow is on top as we pushed it to top on last and red is at the bottom.
        System.out.println(colors); //Display the stack
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.peek()); //will show the topmost object on stack
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.pop()); //will remove the topmost element (display it too) in stack and shift the second top element to top. In this case Yellow and Violet becomes topmost element.
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors); //Display the stack after performing operations
        System.out.println("-----------------------------------------------------------"); //Line Break
        colors.pop(); //will remove the topmost element in stack and shift the second top element to top. In this case Violet. Orange becomes top element.
        System.out.println(colors); //Display the stack after performing operations
        System.out.println("-----------------------------------------------------------"); //Line Break
        System.out.println(colors.peek()); //will show the topmost object on stack (Orange because first yellow was popped and then violet)
    }
}
