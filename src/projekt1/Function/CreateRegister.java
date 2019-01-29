package projekt1.Function;

import projekt1.Register.Customer;
import projekt1.Register.Product;
import projekt1.Register.Register;

import java.util.Scanner;

public class CreateRegister {
    private CreateUser createUser = new CreateUser();
    private CreateProduct createProduct = new CreateProduct();
    private Scanner scanner = new Scanner(System.in);
    private Register register = new Register();

    public void newCustomer () {
        Customer customer = new Customer(createUser.getCustomerName("Skriv ditt namn"),
                createUser.getCustomerAddress("Skriv din stad"));
        register.setCustomersList(customer);

    }
    public void newProduct () {

        Product product = new Product(createProduct.getProductName("Vad vill du köpa?"),
                createProduct.getProductPrice("Skriv pris"),
                createProduct.getProductAmount("Hur många styck vill du ha?"));
        register.setProductsList(product);
    }

    public int customerChoice(){

        return scanner.nextInt();
    }
}

