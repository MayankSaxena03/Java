public class GettersSetters {
    String name;
    int age;
    public static void main(String[] args) {
        /*
            Getters and setters are used to protect your data, particularly when creating classes. 
            For each instance variable, a getter method returns its value while a setter method sets or updates its value. 
            Given this, getters and setters are also known as accessors and mutators, respectively.
        */
        //Setters set what is in the parameters to the variables
        //Getters get the variables
        GettersSetters a = new GettersSetters();
        a.setName("Mayank"); //Calling setter to set Name
        a.setAge(20); //Calling Setter to Set age
        System.out.println("Name : " + a.getName()); //Calling getter to get Name
        System.out.println("Age : " + a.getAge()); //Calling getter to get age
        a.printDetails();
    }
    
    //Getter for Name
    public String getName() {
        return name;
    }
    //Setter for Name
    public void setName(String name) {
        this.name = name;
    }
    //Getter for Age
    public int getAge() {
        return age;
    }
    //Setter for Age
    public void setAge(int age) {
        this.age = age;
    }
    //This function will print name and age
    public void printDetails() {
        System.out.println("Name : " + getName() + "\nAge : " + getAge());
    }
}
