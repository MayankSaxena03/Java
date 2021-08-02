//Enum are used to store values that do not change.
//Declaring enum outside class
//It is recommended to use capital letter in values of enum.
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enum {   
    enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    public static void main(String[] args) {
        System.out.println(Days.TUESDAY); //Accessing enum outside class
        System.out.println(Months.OCTOBER);
    }
}
