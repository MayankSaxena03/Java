package access_modifiers.files.protected_subclass;

import access_modifiers.files.public_private.Access1;

//use of extend makes Access4 subclass of Acces1 giving it access to prublic and protected members despite of different package names.
//We can access public and protected members of Access1 through Access4. See Access2 for reference
public class Access4 extends Access1 {
    public static void main(String[] args) {
        
    }
}
