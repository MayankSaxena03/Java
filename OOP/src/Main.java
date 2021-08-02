//We will access and make new pen and laptop with given configuration in this class
public class Main {
    public static void main(String[] args) {
        Laptop dell = new Laptop(512, 15.6, "i5-9300H" , false); //We created an object of laptop named dell which has 512 gb storage, 15.6 inch display, i5 9th gen processor and is curremtly switched off
        //Displaying object details
        System.out.println("Laptop Configuration\nProcessor : " + dell.processor + "\nDisplay : " + dell.size + "\nStorage : " + dell.storage + "\nSwitched On : " + dell.switchedOn);
        //Switching on the laptop
        dell.switchedOnMethod();
        //Displaying new details after switching on the laptop
        System.out.println("\n\nLaptop Configuration after switching it On\nProcessor : " + dell.processor + "\nDisplay : " + dell.size + "\nStorage : " + dell.storage + "\nSwitched On : " + dell.switchedOn);
    }
}
