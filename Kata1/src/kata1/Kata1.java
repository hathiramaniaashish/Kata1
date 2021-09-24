package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(2001, 9, 27);
        
        Person person = new Person("Aashish", birthdate);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
