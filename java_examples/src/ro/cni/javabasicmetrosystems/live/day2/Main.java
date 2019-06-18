package ro.cni.javabasicmetrosystems.live.day2;

public class Main {
    public static void main(String[] args) {
        House house = new House("caramida",
                4, "Dorobanti 3");

        System.out.println(house.getAddress());

        house.setAddress("La Pacii");
        System.out.println(house.getAddress());



//        Client client = new Client();
//        client.nume = "My name";

//        Client.Address address = new Client.Address();

    }
}
