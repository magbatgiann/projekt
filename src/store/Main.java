package store;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        Register register = new Register ();
        Product product = new Product ();
        Cart cart = new Cart ();


        int userOpt = 0;
        while (userOpt != 7) {
            System.out.println ("\n");
            System.out.println ("* * * * * * * * * * * * *");
            System.out.println ("* * *  Main Menu *  * * *");
            System.out.println ("* * * * * * * * * * * * *");
            System.out.println ("(1) Add an item to the list. ");
            System.out.println ("(2) Enter a customer: ");
            System.out.println ("(3) Display product list:");
            System.out.println ("(4) Display customer list: ");
            System.out.println ("(5) Place a order: ");
            System.out.println ("(6) Print Customer and order. ");
            System.out.println ("(7) Exit. ");

            userOpt = register.getInt ("Enter Your Choice: ");

            switch (userOpt) {
                case 1:
                    register.addProduct ();
                    break;

                case 2:
                    register.addCustomer ();
                    break;

                case 3:
                    register.displayProduct ();
                    break;

                case 4:
                    register.displayCustomer ();
                    break;

                case 5:
                    int usrOpt2 = 0;
                    while (usrOpt2 != 5) {
                        System.out.println ("Choose a Customer: press 1");
                        System.out.println ("Choose a Product: press 2");
                        System.out.println ("Choose a Print Customer and Products in Cart: press 3");
                        System.out.println ("Go back to main menu: press 4");
                        usrOpt2 = register.getInt ("Make a choice: ");
                        switch (usrOpt2) {
                            case 1:
                                register.displayCustomer ();
                                int customerID = register.getInt ("Enter Customer ID:");
                                Customer customer = register.findCustomer (customerID);
                                System.out.println ("You've choose:" + customer);
                                break;
                            case 2:
                                System.out.println ("Choose a product by name: ");
                                register.displayProduct ();
                                System.out.println ("Enter the name");
                                String chosenProduct = scanner.nextLine ();
                                cart.addToCart (register.findProduct (chosenProduct));
                                System.out.println ("Item added to list successfully");
                                break;
                            case 3:
                                System.out.println ("You have in your Shopping Cart");
                                cart.displayCartList ();
                                System.out.println ( cart.toString ());
                                break;
                            case 4:
                                usrOpt2 = 5;
                                break;
                            default:
                                System.out.println ("Enter your choice: ");
                        }
                    }
                    break;

                case 6:
                    System.out.println (cart.toString ()+"");
                    break;

                default:

            }
        }

        System.out.println ();

    }

}

