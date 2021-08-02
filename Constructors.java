public class Constructors {
    public static void main(String[] args) {
        /*
            A constructor in Java is a special method that is used to initialize objects. 
            The constructor is called when an object of a class is created.
            There are two types of constructor : parameterized and non-parametrized
        */
        //Refer ClassesProgram.java and AccessModifiers folder files

        //Creating StudentInfo class object
        StudentInfo object2 = new StudentInfo(); //No Parameters will be passed in constructor
        //Accessing objects
        System.out.println("Name : "+object2.name);
        System.out.println("Age : "+object2.age);
        System.out.println("Address : "+object2.address);

        System.out.println("-----------------------------------------------"); //Line Break
        
        //Creating MyInfo class object
        MyInfo object1 = new MyInfo("Harsh", 19, "123, BVP Pune");  //Pasing parameters in constructor
        //Accessing objects
        System.out.println("Name : "+object1.name);
        System.out.println("Age : "+object1.age);
        System.out.println("Address : "+object1.address);
    }
}

//Making two classes : with parameterized constructor and with non parameterized constructor
//If no constructor is defined in class then a default constructor gets called. Default constructor does not affect our program. It initializes our variables with default values 

//With non parameterized Constructor
class StudentInfo {
    String name;
    int age;
    String address;

    //Making non parameterized constructor
    StudentInfo() {
        name = "Mayank";
        age = 19;
        address = "Bharati Vidyapeeth College of Engineering, Pune";
    }
}

//With Parameterized Constructor
class MyInfo {
    String name;
    int age;
    String address;

    //Making parameterized constructor
    MyInfo(String myName, int myAge, String myAddress) {
        name = myName;
        age = myAge;
        address = myAddress;
    }
}
