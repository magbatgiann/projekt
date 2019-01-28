package oop;

public class Adress {
    private String city;
    private String street;
    private int houseNumber;

    public Adress(String city, String street, int houseNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        String s = street + " " + houseNumber + "\n" + city;
        return s;
    }
}
