package store;
//import static store.Register.readTextFileFromResources;
//import static store.Register.writeTextFile;

public class Main {
    private static final String Order = "Order";

    public static void main(String[] args) throws Exception {

//        readTextFileFromResources();
//        File file = new File("C:\\Users\\magda\\Desktop\\Testare2019\\src\\store");
//        writeTextFile(file, "order.txt");

        Register register = new Register();
        register.readFile (Order);
        int userOpt = 0;
        while (userOpt != 8) {
            System.out.println("\n");
            System.out.println("* * * * * * * * * * * * *");
            System.out.println("* * *  Main Menu *  * * *");
            System.out.println("* * * * * * * * * * * * *");
            System.out.println("(1) Enter a customer name with big letter as first: ");
            System.out.println("(2) Add an item to the list with big letter as first. ");
            System.out.println("(3) Display product list:");
            System.out.println("(4) Display customer list: ");
            System.out.println("(5) Place a order: ");
            System.out.println("(6) Print Customer and order. ");
            //System.out.println("(7) Show order history ");
            System.out.println("(8) Exit");
            userOpt = register.getInt("Please select a number option from main menu: ");

            switch (userOpt) {
                case 1:
                    register.addCustomer();
                    break;

                case 2:
                    register.addProduct();
                    break;

                case 3:
                    System.out.println(register.displayProduct());
                    break;

                case 4:
                    register.displayCustomer();
                    break;

                case 5:
                    int usrOpt2 = 0;
                    while (usrOpt2 != 5) {
                        System.out.println("Select Customer: press 1");
                        System.out.println("Select Product: press 2");
                        System.out.println("Products in Cart: press 3");
                        System.out.println("Go back to menu: press 4");
                        usrOpt2 = register.getInt("Select option: ");
                        switch (usrOpt2) {
                            case 1:
                                register.chooseCustomer();
                                break;
                            case 2:
                                register.placeOrder();
                                break;
                            case 3:
                                register.displayOrderList();
                                break;
                            case 4:
                                usrOpt2 = 5;
                                break;
                            default:
                                System.out.println("Try again: ");
                        }
                    }
                    break;
                case 6:
                    if (register.orderAndTotalPrice()) {
                        if (register.makeOrder("If you want to make the order: press 1, If you want to go back to main menu please press 2"))
                       {

                           try {
                               register.saveFile(Order);
                           }
                           catch (Exception e) {
                               e.printStackTrace();
                           }
                           System.out.println("Order Saved and send");
                       } else
                            System.out.println("\n");
                    } else
                        System.out.println("Place Order and choose customer first.");

                    break;

//                case 7:
//                    try {
//
//                        System.out.println("All data loaded " + Order);
//                    }
//                    catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                  break;
                case 8:
                    register.saveFile(Order);
                    System.exit(0);
                default:
                    System.out.println("Wrong! Try again.");
            }
            System.out.println();
        }

    }

}