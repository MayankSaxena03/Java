public class ClassesProgram {
    public static void main(String[] args) {
        //Creating class objects
        Class1 obj = new Class1();
        Class2 obj2 = new Class2();
        //Accessing Class1 objects
        System.out.println("Integer object of Class1 : "+obj.a);
        System.out.println("Character object of Class1 : "+obj.alphabet[0]);
        //Accessing Class2 objects
        System.out.println("Integer object of Class2 : "+obj2.b);
        System.out.println("Character object of Class2 : "+obj2.letters[0]);
        //Accessing Class1 Method
        obj.sayHi();
        obj2.sayHello();
    }
}

//Making new Classes. We can make as many classes as we want. Here i am making two classes for example
//You will have to define access type like public, private an protected for class if you are making a new file for them

class Class1 {
    //Declaring Integers
    int a = 2;
    char[] alphabet = {'a', 'b', 'c', 'd'};
    //Making Methods
    void sayHi() {
        System.out.println("Hi from Class1");
    }
}

class Class2 {
    //Declaring Integers
    int b = 3;
    char[] letters = {'m', 'n', 'o', 'p'};
    //Making Methods
    void sayHello() {
        System.out.println("Hello from Class2");
    }
}
