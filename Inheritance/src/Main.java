public class Main {
    public static void main(String[] args) {
        //Creating all three mouse objects
        Mouse1 logitech = new Mouse1();
        Mouse2 hp = new Mouse2();
        Mouse3 asus = new Mouse3();

        //Calling methods from all three objects
        
        System.out.println("Mouse 1 specs");
        //accessing methods of class Mouse and Mouse1 through Mouse1's object i.e. logitech. 
        //First four are methods from class Mouse and the fifth one is Mouse1's method
        logitech.rightClicked();
        logitech.leftClicked();
        logitech.scrollUp();
        logitech.scrollDown();
        logitech.scrollClick();


        System.out.println("\n\nMouse 2 specs");
        //accessing methods of class Mouse and Mouse2 through Mouse1's object i.e. hp. 
        //First four are methods from class Mouse and the fifth one is Mouse2's method
        hp.rightClicked();
        hp.leftClicked();
        hp.scrollUp();
        hp.scrollDown();
        hp.thirdClick();


        System.out.println("\n\nMouse 3 specs");
        //accessing methods of class Mouse and Mouse3 through Mouse1's object i.e. asus. 
        //First four are methods from class Mouse and the fifth one is Mouse3asus method
        asus.rightClicked();
        asus.leftClicked();
        asus.scrollUp();
        asus.scrollDown();
        asus.dpiClick();
    }
}
