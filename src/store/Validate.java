package store;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name  :");
        String customerName = scanner.nextLine();
        if
        (!Register.ValidateInput.validateCustomerName(customerName)) {
            System.out.println("wrong format");
        } else {
            System.out.println("Correct!");
        }
    }
}
