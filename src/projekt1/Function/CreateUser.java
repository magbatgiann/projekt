package projekt1.Function;

import java.util.Scanner;

public class CreateUser {
    private Scanner scanner = new Scanner(System.in);

    public String getCustomerName (String name){

        System.out.println(name);
        return scanner.nextLine();
    }

    public String getCustomerAddress (String address){

        System.out.println(address);
        return scanner.nextLine();
    }

}
