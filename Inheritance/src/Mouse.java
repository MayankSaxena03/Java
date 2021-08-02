public class Mouse {
    
    //Making methods that all mouse can do so that other mouse classes can inherit from this mouse class
    public static void rightClicked() {
        System.out.println("Right Clicked!");
    }
    public static void leftClicked() {
        System.out.println("Left Clicked!");
    }
    public static void scrollUp() {
        System.out.println("Scrolled Up!");
    }
    public static void scrollDown() {
        System.out.println("Scrolled Down!");
    }

}
