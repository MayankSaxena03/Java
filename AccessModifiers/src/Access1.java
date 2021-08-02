package access_modifiers.files.public_private;

public class Access1 {
    //There are four types of access modifiers : default,public,private,protected
    //default example
    int hours = 3; //can be accessed by another class
    //public
    public int minutes = 47; //can be accessed by another class
    //private example
    private int seconds = 54; //can be accessed by another class
    //protected examples
    protected int milliSeconds = 992; //can be accessed by another class of same package
}
