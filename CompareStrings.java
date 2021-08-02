public class CompareStrings {
    public static void main(String[] args) {
        //There are multiple ways to compare string in java
        String a = "Mayank";
        String b = "Mayank";
        //If we declare string as above we can use == to compare
        if(a==b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        } //This if-else will return true
        String c = new String("Mayank");
        String d = new String("Mayank");
        if(c==d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        } //This block will return false because we cannot compare two objects with ==
        if(c.equals(d)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        } //This block will return true as we are comparing strings instead of objects
    }
}
