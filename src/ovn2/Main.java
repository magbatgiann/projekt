package ovn2;

import oop.Adress;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();


        House myHouse = new House(120,1,1000000,1995,new Adress("Skogen","Lingonstigen", 1));
        House myHouse2 = new House(83,4,900000,1950,new Adress("Lappland","Smultronsgatan", 18));


        //  System.out.println(myHouse);

        Person pelle = new Person("Pelle","Crash test Dummy", 27, 184, Sex.MALE, myHouse);

        persons.add(pelle);
        persons.add(new Person("Susan","Kiosk", 22, 162, Sex.FEMALE, myHouse2));
        persons.add(new Person("Kane","Bar", 19, 156, Sex.OTHER, myHouse2));

        for(int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i));
        }


        System.out.println(pelle);

    }
}