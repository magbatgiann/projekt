package projekt1;

public class Person {
    private String name;
    private String city;
    private static int customerID;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
       //int i = customerID
    }
    public static int getCustomerID() {
        return customerID;
    }

    public static void setCustomerID(int customerID) {
        Person.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name + "," + city + "," + ++ customerID;

}
}
