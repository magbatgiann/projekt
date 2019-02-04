package store;

import java.util.*;


public class Register {

    Scanner scanner = new Scanner (System.in);
    HashMap<Integer, Customer> customerList = new HashMap<> ();
    HashMap<String, Product> productList = new HashMap<> ();
    ArrayList<Product> cartList = new ArrayList<> ();

    public void addCustomer () {
        System.out.println ();

        String customerName = getString ("Enter Your Name: ");

        String customerAddress = getString ("Enter Your City: ");

        int customerID = new Random ().nextInt(100) + 1;

        Customer customer = new Customer (customerName, customerAddress, customerID);
        customerList.put (customerID, customer);
        System.out.println ("Customer Added");

    }

    Customer findCustomer(int customerID) {
        return customerList.get (customerID);

    }

    Product findProduct(String name) {
        String key =null;

        for (Map.Entry entry : productList.entrySet ()) {
            if (name.equals (entry.getValue ())) {
                key = (String) entry.getKey ();
                break;

            }
        }
        return productList.get (key);
    }

    public String getString(String s){
        System.out.println (s);
        String textToTest="o";

        try {
            textToTest= scanner.nextLine();
            //   Character.isUpperCase(textToTest.codePointAt(0));
        }catch(InputMismatchException e){

            System.out.println("Felaktig inmatning!");

        }

        return textToTest;

    }


    public void addProduct () {
        System.out.println ();

        String productName = getString ("Enter in the name of the product");

        System.out.println ("Enter in the price of the product");
        double productPrice = Double.parseDouble (scanner.nextLine ());

        System.out.println ("Choose the unit of the product : Liter , Styck , Kg");
        String units = scanner.nextLine ();

        Product product = new Product (productName, productPrice,
                units);
        String productID = UUID.randomUUID().toString();
        productList.put (productID ,product);
        System.out.println ("Product has been added to your order");
    }

    public void displayProduct () {
        System.out.println (productList.size () + " items. ");
        for(Map.Entry m:productList.entrySet()){
            System.out.println(" "+m.getValue());
        }

    }

    public void displayCustomer () {
        System.out.println (customerList.size () + " Customers. ");

        for(Map.Entry m:customerList.entrySet()){
            System.out.println("ID:"+m.getKey()+" "+m.getValue());
        }



    }


    public int getInt(String s) {
        System.out.println(s);
        int getInfo = Integer.parseInt(scanner.nextLine());
        return getInfo;
    }
}
