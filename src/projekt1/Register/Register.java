package projekt1.Register;

import java.util.ArrayList;

public class Register {

    private static ArrayList<Product> productsList;
    private Product product;
    private Customer customer;
    private static ArrayList<Customer> customersList;

    public Register(Product product, Customer customer){
        this.customer = customer;
        this.product = product;
    }

    public Register (){

        productsList = new ArrayList<Product>();
        customersList = new ArrayList<Customer>();
    }

    public void setCustomersList (Customer addCustomer){

        customersList.add(addCustomer);
    }

    public void setProductsList (Product addProduct){

        productsList.add(addProduct);
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Customer List: \n");
        int size= customersList.size();
        for (int i =0;i < size; i++) {
            stringBuilder.append(customersList.get(i)).append("\n");
        }
        stringBuilder.append("Products List: \n");

        int size2= productsList.size();
        for (int j = 0; j < size2; j++) {
            stringBuilder.append(productsList.get(j)).append("\n");
        }

        //   String s = "Last Customer and Product: \n" +
        //           product + "\n" +

        //         customer + "\n"
        //           +"\nCustomersList:\n" + customersList + "\n" +
        //           "\nProductsList:\n" + productsList + "\n";
        ;
        return   stringBuilder.toString();
    }
}
