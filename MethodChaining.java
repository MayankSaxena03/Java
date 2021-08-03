public class MethodChaining {
    public static void main(String[] args) {
        //Multiple methods in one line is called method chaining
        String a = "MayaNk";
        a = a.toLowerCase();
        a = a.concat(" is a good boy");
        System.out.println(a);
        String b = "HarSh";
        //We can call toLowerCase Method and concat Method in same line.
        b = b.toLowerCase().concat(" is also a good boy"); //Both method are called in single line. It reduces the length of code.
        System.out.println(b);
    }
}
