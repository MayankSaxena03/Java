import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        //Refer https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        
        Date currentDate = new Date();
        System.out.println(currentDate); //will print all details 
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate)); //will print clock in 24 hour format

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(currentDate)); //will print Day/Month/Year

		SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayOfTheWeekFormat.format(currentDate)); //will print day name. To print short form use EEE

		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		System.out.println(clockFormat.format(currentDate)); //will print clock in 12 hour format
    }
}
