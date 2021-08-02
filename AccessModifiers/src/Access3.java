package access_modifiers.files.protected_subclass; //Package is different than previous 2 classes

import access_modifiers.files.public_private.Access1;

public class Access3 {
   public static void main(String[] args) {
       
       Access1 a = new Access1();
       System.out.println(a.minutes); //only public objects and methods are shared by Access1.java. Protected objects and methods are not shared due to different package name.
   } 
}
