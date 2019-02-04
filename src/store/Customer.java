package store;

public class Customer {

    private String customerName;
    private String customerAddress;
    private  int customerID ;



   public Customer()
    { }

    public Customer(String customerName, String customerAddress, int customerID)
    {
        this.customerID = customerID;
        this.customerAddress = customerAddress;
        this.customerName = customerName;


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