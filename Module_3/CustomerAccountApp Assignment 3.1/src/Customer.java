/**
 * Design a class named Customer to represent a customer. This class contains:
 * 1. A private string data field named name that specifies the name of a customer.
 * 2. A private string data field named address that specifies the address of a customer.
 * 3. A private string data field named city that specifies the city of a customer.
 * 4. A private string data field named zip that specifies the zip code of a customer.
 * 5. A no-argument constructor that creates a default customer.
 * 6. An argument constructor that creates a customer using the four data fields.
 * 7. Accessor methods for all four data fields.
 * 8. Override the toString() method.
 */
public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer() {
    }

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Name=" + name + "\n" +
                "Address=" + address + "\n" +
                "City=" + city + "\n" +
                "Zip=" + zip;
    }
}