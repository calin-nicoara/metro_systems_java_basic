package ro.cni.javabasicmetrosystems.prepared.day2.internal_classes;

public class Client {

    static int numberOfClients = 0;

    String name;
    String phoneNumber;
    Address address;

//    public void checkAddress() {
//        System.out.println(streetName); // cannot see Address member variables
//    }

    public class Address {
        String street;
        String streetName;

        // Works because an Address can only exist in the context of a Client
        public void checkClient() {
            System.out.println(name);
        }
    }

    // Can be instantiated without a Client object
    public static class Address2 {
        String street;
        String streetName;

        // Does not work because the class is static. Cannot see member variables of Client instance
//        public void checkClient() {
//            System.out.println(name);
//        }

        public void checkNumberOfClients() {
            System.out.println(numberOfClients);
        }
    }

    public static void main(String[] args) {
        // Address
        Client client = new Client();
        client.name = "Popescu";
        Address address = client.new Address();

        address.street = "Dorobanti";

        address.checkClient();

        // Address2
        Client.Address2 address2 = new Client.Address2();
    }
}
