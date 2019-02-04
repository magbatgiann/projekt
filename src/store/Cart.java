package store;

import java.util.ArrayList;

public class Cart{

    Customer customer;
    private double totalSum;
    static ArrayList<Product> cartListOrders = new ArrayList<> ();


    public Cart(){}



    public double getTotalSum () {
        return totalSum;
    }

    public void setTotalSum (double totalSum) {
        this.totalSum = totalSum;
    }


    public double calculateTotalSum () {

        double total = 0;
        for (int i = 0; i < cartListOrders.size (); i++) {
            Product product = cartListOrders.get (i);
            total += product.getProductPrice ();
        }
        return total;
    }

    public void addToCart (Product product) {

        cartListOrders.add (product);
    }

    public void displayCartList (){

        for (Product cart : cartListOrders) {
            System.out.println (cart);
        }
    }


    @Override
    public String toString () {
       // calculateTotalSum();
        return "ShoppingCart: " + "\nCustomer:" + customer +
                "Products in the cart: " + cartListOrders +
                ", Total Price: " + totalSum;
    }
}