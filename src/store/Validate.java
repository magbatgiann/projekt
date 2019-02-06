package store;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name  :");
        String customerName = scanner.nextLine();
        if
        (!Register.ValidateInput.validateCustomerName(customerName)) {
            System.out.println("Format isn't correct. Please try again. Spell with first big letter.");
        } else {
            System.out.println("Correct!");
        }
    }
}
