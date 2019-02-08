package store;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Register implements Serializable {
    private final static long serialVersionUID = 4661471824932115886L;

    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Customer> customerList = new HashMap<>();
    ArrayList<Product> productsList = new ArrayList<>();
    ArrayList<String> orderList = new ArrayList<> ();
    Customer customerChosen;


    public void addCustomer() {
        System.out.println();

        String customerName = getString("Enter Customer Name: ");

        String customerAddress = getString("Enter Customer Address: ");

        int customerID = new Random().nextInt(100) + 1;
        Customer customer = new Customer(customerName, customerAddress, customerID);
        customerList.put(customerID, customer);
        System.out.println("Customer Added");

    }
    public static class ValidateInput {
        public static boolean validateCustomerName(String customerName) {
            return customerName.matches("[A-ZÅÖÄ][a-zåöä]*");
        }
    }


    Customer findCustomer(int customerID) {
        return customerList.get(customerID);

    }


    public String displayOrderList() {

        System.out.println(customerChosen);
        System.out.println("You have in your shopping cart: ");
        System.out.println(customerChosen.orderList.size() + " items. ");
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : customerChosen.orderList) {
            stringBuilder.append(product.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public boolean orderAndTotalPrice() {


        double totalPrice = 0;
        if (customerChosen == null)
            return false;
        else {
            for (Product product : customerChosen.orderList) {
                totalPrice += product.getProductPrice();

            }
            System.out.println(displayOrderList());
            System.out.println("Total price: " + totalPrice);
            return true;
        }
    }

    public void addProduct() {

        System.out.println();

        String productName = getString("Enter the name of the product you want to buy: ");

        System.out.println("Enter the price of the product: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Choose the unit of the product : Liter , Piece , Kg");
        String units = scanner.nextLine();

        Product product = new Product(productName, productPrice,
                units);
        System.out.println("Product has been added to your order");

        productsList.add(product);
    }

    public String displayProduct() {
        System.out.println(productsList.size() + " items. ");
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productsList) {
            stringBuilder.append(product.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }

    public void chooseCustomer() {
        displayCustomer();
        int customerID = getInt("Enter Customer ID:");
        Customer customer = findCustomer(customerID);
        System.out.println("You Selected:" + customer);
        customerChosen = customer;

    }

    public void placeOrder() {

        if (customerChosen != null) {
            System.out.println("Order for customer: " + customerChosen);
            int userOption = 0;
            while (userOption != 3) {
                System.out.println("Place an order for this Customer press 1: ");
                System.out.println("Switch customer to make an order press 2: ");
                System.out.println("Exit to menu press 3: ");
                userOption = getInt("Enter your choice: ");

                switch (userOption) {
                    case 1:
                        addItemToOrderList();
                        break;

                    case 2:
                        customerChosen.orderList.clear();
                        chooseCustomer();
                        addItemToOrderList();
                        break;

                    default:
                }
            }
        } else
            addItemToOrderList();
    }

    public void addItemToOrderList() {

        System.out.println("\nChoose a product by name: ");
        System.out.println(displayProduct());
        String chosenProduct = getString("Enter the name");

        for (Product product : productsList) {
            if (product.getProductName().equals(chosenProduct)) {
                customerChosen.addToOrderList(product);
            }
        }
        System.out.println("Item Added" + customerChosen.getProductArrayList());
    }

    public void displayCustomer() {
        System.out.println(customerList.size() + " Customers. ");

        for (Map.Entry<Integer, Customer> m : customerList.entrySet()) {
            System.out.println("ID:" + m.getKey() + " " + m.getValue());
        }

    }

    public String getString(String s) {
        String textToTest = "o";
        for (int i = 0; i < 5; i++) {

            System.out.println(s);

            textToTest = scanner.nextLine();
            if
            (!Register.ValidateInput.validateCustomerName(textToTest)) {
                System.out.println("Wrong format. Please try again!");
            } else {
                System.out.println("Correct!Next step.");
                break;
            }
        }
        return textToTest;
    }

    public int getInt(String s) {
        System.out.println(s);
        return Integer.parseInt(scanner.nextLine());
    }


    public boolean makeOrder(String s) {
        System.out.println(s);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice == 1;

    }

        void saveFile (String Order) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream ("Order"));
        out.writeObject (orderList);
        out.writeObject (customerList);
        out.writeObject(productsList);
        out.close ();
    }

        void readFile(String Order) throws Exception {
        ObjectInputStream in = new ObjectInputStream (new FileInputStream ("Order"));
        orderList = (ArrayList<String>)in.readObject ();
        customerList = (HashMap<Integer, Customer>)in.readObject ();
        productsList = (ArrayList<Product>)in.readObject ();

        in.close ();
    }
}
