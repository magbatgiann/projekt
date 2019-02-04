package projekt1.Register;

import java.util.ArrayList;
import java.util.UUID;

public class Customer {

    private String customerID;
    private String name;
    private String address;
    private ArrayList<String> shoppingCart;


    public Customer(String name, String address) {
        customerID = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
    }

    public void getShoppingCart() {

        for (int i=0;i<10;i++) {
            shoppingCart.add("i");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer: " +
                "Name:" + name  +
                "; Address: " + address +
                 "; CustomerID: " + customerID
                //             + "Items in the shoppingCart:" + shoppingCart
                ;
    }
}
