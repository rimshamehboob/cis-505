/**
 * A public static method named getCustomer with an Integer argument named id and a
 * return type of Customer. Using an if…else if…else if…else statement, compare the
 * argument id data field against the values 1007, 1008, and 1009. For each match, return a
 * new customer object with unique fields. If there are no matches, return a default
 * customer object.
 */
public class CustomerDB {
    public static Customer getCustomer(int id) {
        if (id == 1007) {
            return new Customer("John Carry", "Downtown Canada", "Canada", "235323Z");
        } else if (id == 1008) {
            return new Customer("Donald Trump", "Silicon Valley", "California", "AU98398X");
        } else if (id == 1009) {
            return new Customer("Henry clinton", "East Hall , Street 6 ", "Sydeny", "57003Q");
        } else {
            System.out.println("Default Customer Selected.");
            return new Customer("Geroge Bush", "Missippi", "Bern , Switzerland", "SER235323Z");
        }
    }
}