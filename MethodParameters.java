public class MethodParameters {
    public static void main(String[] args) {
        //Parameters are values passed in bracket
        //Calling methods without passing parameters
        sayHi();
        //Calling methos by passing the parameeters
        sayNameAge("Mayank", 19);
        sayNameAge("Harsh", 20);
    }
    
    //Method without parameters
    public static void sayHi() {
        System.out.println("Hi");
    }

    //Method with parameters.
    static void sayNameAge(String name, int age) {
        System.out.println(name+" is "+age+" years old.");
    }
}
