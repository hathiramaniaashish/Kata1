package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Aashish", new Date(99, 8, 27));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
