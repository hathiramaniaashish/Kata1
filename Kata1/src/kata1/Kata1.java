package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar birthdate;
        birthdate = GregorianCalendar.getInstance();
        birthdate.set(2001, 9, 27);
        
        Person person = new Person("Aashish", birthdate);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
