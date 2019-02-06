package store;


import java.util.ArrayList;

public class Customer  {

    private String customerName;
    private String customerAddress;
    private  int customerID ;
    ArrayList<Product> orderList = new ArrayList<>();


    public void addToOrderList (Product product) {
        orderList.add (product);
    }

    public ArrayList<Product> getProductArrayList () {
        return this.orderList;
    }


   public Customer()
    { }

    public Customer(String customerName, String customerAddress, int customerID)
    {
        this.customerID = customerID;
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        orderList = new ArrayList<Product> ();

    }



    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerAddress (String customerAddress)
    {
        this.customerAddress = customerAddress;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }


    @Override
    public String toString()
    {
        return " Customer Name: " + customerName +
                " Customer Address: " + customerAddress +
                " Customer ID: " + customerID;
    }
}