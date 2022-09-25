import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * (The Account class #3). Design a class named Account to represent an account. This class contains:
 * 1. A private double data field named balance. The default is 200.
 * 2. An accessor method for the balance data field.
 * 3. A public method named deposit with a double argument named amt and a return type of void. Increase the running total of the balance data field using the methods argument.
 * 4. A public method named withdraw with a double argument named amt and a return type of void. If the balance data field is greater than or equal to the argument, decrease the running total of the balance field using the methods argument.
 * 5. A public method named displayMenu with a return type of void.
 * 6. A public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy
 */
public class Account {
    private double balance = 200;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean doExitApp = false;

        do {
            System.out.println("\n\nAccount Menu");
            System.out.println("Enter <D/d> for deposit  : ");
            System.out.println("Enter <W/w> for withdraw : ");
            System.out.println("Enter <B/b> for balance  :");
            System.out.print("Enter option:>");

            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("D")) {
                System.out.print("Enter deposit amount.");
                deposit(scanner.nextDouble());
            } else if (userInput.equalsIgnoreCase("W")) {
                System.out.print("Enter withdraw amount.");
                withdraw(scanner.nextDouble());
            } else if (userInput.equalsIgnoreCase("B")) {
                System.out.println(getBalance());
            } else {
                System.out.println("Error: Invalid Option.");
            }

            System.out.println("Continue ? (y/n)");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("N")) {
                doExitApp = true;
            } else if (userInput.equalsIgnoreCase("Y")) {
                displayMenu();
            } else {
                System.out.println("Error: Invalid Option.");
            }
        } while (!doExitApp);
    }


    public String getTransactionDate() {
        return new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
    }
}