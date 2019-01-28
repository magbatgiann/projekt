package projekt1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person person = new Person("Karl","Luleå");
        Person person2 = new Person ("Zan", "Göteborg");
        Person person3 = new Person ("Magda" , "Göteborg");


        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
    }
}