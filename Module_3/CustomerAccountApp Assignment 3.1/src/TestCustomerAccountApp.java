import java.util.Scanner;

/**
 * Design a class named TestCustomerAccountApp to test the Account, Customer, and CustomerDB classes:
 * 1. Prompt the user to enter a customer number between 1007 and 1009. Use the inputted
 * number to invoke the getCustomer static method and assign the returned value to a variable named customer.
 * 2. Display the account menu using the accounts displayMenu method.
 * 3. Handle the user’s selection and invoke the corresponding method. For invalid selections, display a message “Error: Invalid Option.”
 * 4. Allow the user to continue to select as many options as they choose by prompting them to
 * decide between continuing or exiting the menu. Use a do…while loop in your programming logic.
 * 5. After exiting the menu, display the customers details using the customer classes
 * toString() method. Next, on a separate line, show the customers account balance.
 */
public class TestCustomerAccountApp {

    public static void main(String[] args) {

        System.out.print("Enter a customer number between 1007 and 1009 : ");
        Scanner input = new Scanner(System.in);
        int customerNumber = input.nextInt();

        Customer customer = CustomerDB.getCustomer(customerNumber);
        Account account = new Account();
        account.displayMenu();

        System.out.println("--- Customer Details ---");
        System.out.println(customer);
        System.out.println();
        System.out.print("Balance as of " + account.getTransactionDate() + " is ");
        System.out.printf("$%6.2f" + account.getBalance());
    }
}