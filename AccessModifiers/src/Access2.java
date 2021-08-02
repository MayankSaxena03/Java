package access_modifiers.files.public_private; //Package is same as Access1.java so it will have access to protected variables

import access_modifiers.files.protected_subclass.Access4;

public class Access2 {
    public static void main(String[] args) {
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
        //System.out.println(a.seconds); //We cannot access seconds variable in this class as it is private in Access1.java
        System.out.println(a.milliSeconds);
        //Accesing Access1 objects from its subclass Acces4
        Access4 b = new Access4();
        System.out.println(b.hours);
        System.out.println(b.minutes);
        System.out.println(b.milliSeconds);
    }
}
