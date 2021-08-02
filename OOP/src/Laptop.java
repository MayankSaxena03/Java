//We will create multiple objects which define the properties of a physical laptop
public class Laptop {
    int storage;
    double size;
    String processor;
    boolean switchedOn;
    
    //Constructor to construct the object with given specifications
    public Laptop(int storage, double size, String processor, boolean switchedOn) {
        this.storage = storage;
        this.size = size;
        this.processor = processor;
        this.switchedOn = switchedOn;
    }
    
    //Methods to make the laptop switch on & off
    public void switchedOnMethod() {
        switchedOn = true;
    }
    public void switchedOffMethod() {
        switchedOn = false;
    }

}
