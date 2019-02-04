package store;
import java.util.*;

public class Register {

    Scanner scanner = new Scanner (System.in);
    HashMap<Integer, Customer> customerList = new HashMap<> ();
    ArrayList<Product> productsList = new ArrayList<> ();
    ArrayList<Product> orderList = new ArrayList<> ();
    Customer customerChosen;


    public void addCustomer () {
        System.out.println ();

        String customerName = getString ("Enter Customer Name: ");

        String customerAddress = getString ("Enter Customer Address: ");
        int customerID = new Random ().nextInt(100) + 1;
        Customer customer = new Customer (customerName, customerAddress, customerID);
        customerList.put (customerID, customer);
        System.out.println ("Customer Added");

    }

    Customer findCustomer(int customerID) {
        return customerList.get (customerID);

    }


    public void displayOrderList() {

        System.out.println ("You have in your shopping cart: ");
        System.out.println (customerChosen);
        System.out.println (orderList);
    }

    public void orderAndTotalPrice () {


        double totalPrice = 0;

        for (Product product : orderList) {
            totalPrice = product.getProductPrice ();
            totalPrice = totalPrice + totalPrice;
        }
        System.out.println (customerChosen);
        displayOrderList();
        System.out.println ("Total price: " + totalPrice);
    }

    public void addProduct () {

        System.out.println ();

        String productName = getString ("Enter the name of the product you want to buy: ");

        System.out.println ("Enter the price of the product: ");
        double productPrice = Double.parseDouble (scanner.nextLine ());

        System.out.println ("Choose the unit of the product : Liter , Piece , Kg");
        String units = scanner.nextLine ();

        Product product = new Product (productName, productPrice,
                units);
        System.out.println ("Product has been added to your order");

        productsList.add (product);
    }

    public String displayProduct () {
        System.out.println (productsList.size () + " items. ");
        StringBuilder stringBuilder = new StringBuilder ();
        for (Product product : productsList) {
            stringBuilder.append (product.toString ());
            stringBuilder.append ("\n");
        }
        return stringBuilder.toString ();

    }
    public void chooseCustomer () {
        displayCustomer ();
        int customerID = getInt ("Enter Customer ID:");
        Customer customer = findCustomer (customerID);
        System.out.println ("You Selected:" + customer);
        customerChosen = customer;

    }

    public void placeOrder () {
        System.out.println ("Choose a product by name: ");
        System.out.println (displayProduct ());
        String chosenProduct = getString ("Enter the name");
        for (int i = 0; i < productsList.size (); i++) {
            if (productsList.get (i).getProductName ().equals (chosenProduct)) {
                orderList.add (productsList.get (i));
            }
        }
        System.out.println ("Item Added" + orderList);

    }

    public void displayCustomer () {
        System.out.println (customerList.size () + " Customers. ");

        for(Map.Entry m:customerList.entrySet()){
            System.out.println("ID:"+m.getKey()+" "+m.getValue());
        }

    }

    public String getString(String s){
        System.out.println (s);
        String textToTest="o";

        try {
            textToTest= scanner.nextLine();
            Character.isUpperCase(textToTest.codePointAt(0));
        }catch(InputMismatchException e){

            System.out.println("Ooops !! Something went wrong!");

        }

        return textToTest;

    }

    public int getInt(String s){
        System.out.println (s);
        return Integer.parseInt (scanner.nextLine ());
    }
}
