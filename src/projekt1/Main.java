package projekt1;


import projekt1.Function.CreateCustomer;
import projekt1.Function.CreateRegister;
import projekt1.Register.Customer;
import projekt1.Register.Register;


public class Main {

    CreateRegister createRegister = new CreateRegister();

    public static void main(String[] args) {

        CreateRegister createRegister = new CreateRegister();
        Register register = new Register();
        CreateCustomer createCustomer = new CreateCustomer();
        Customer customer = new Customer();
        boolean i = true;
        do {
            System.out.println("Välj alternativ nedan: \n" +
                    "Skapa användare: tryck 1\n" +
                    "Välj produkt: tryck 2\n" +
                    "Vissa listan med användaren och produkterna: tryck 3\n" +
                    "Gå ut: tryck" +
                    " 4");
            i = false;
            int choise = createRegister.customerChoice();
            if (choise == 1) {
                createRegister.newCustomer();
                i = true;
            }

            else if (choise == 2) {
                createRegister.newProduct();
                i = true;
            }

            else if (choise == 3) {

                System.out.println(customer.toString());
                System.out.println(register.toString());
                System.out.println(register);
                i = true;
            }
            else
                System.out.println("Exit");


        }
        while (i);
          //Register register = new Register(createRegister.newProduct() , createRegister.newCustomer());

    }


}
