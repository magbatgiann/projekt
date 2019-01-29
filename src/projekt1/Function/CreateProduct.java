package projekt1.Function;

import java.util.Scanner;

public class CreateProduct {

    private Scanner scanner = new Scanner(System.in);



    public double getProductPrice (String price){

        System.out.println(price);
        return Double.parseDouble(scanner.nextLine());
    }

    public int getProductAmount (String value) {

        System.out.println(value);
        return Integer.parseInt(scanner.nextLine());
    }
    public String getProductName (String name){

        System.out.println(name);
        return scanner.nextLine();
    }
}