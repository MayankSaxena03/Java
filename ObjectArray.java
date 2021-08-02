public class ObjectArray {
    public static void main(String[] args) {
        //Refer ClassesProgram.java
        //Creating Monkey objects
        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();
        //Storing Monkey objects in an array
        Monkey[] monkeys = {m1,m2,m3};
        //Calling monkey methods
        //Refer ForEachLoop.java for this loop explaination
        for(Monkey m : monkeys) {
            m.sayHi();
        }
    }
}

//Creating class
class Monkey {
    String name;
    int age;
    public void sayHi() {
        System.out.println("Hi i am a monkey");
    }
}