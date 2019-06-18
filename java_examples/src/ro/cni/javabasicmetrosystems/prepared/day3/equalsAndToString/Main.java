package ro.cni.javabasicmetrosystems.prepared.day3.equalsAndToString;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel", "256GB Solid State",
                "16GB DDR4", "Nvidia");

        Computer computer2 = new Computer("Intel", "256GB Solid State",
                "16GB DDR4", "Nvidia");

        Computer computer3 = new Computer("AMD", "512GB Solid State",
                "16GB DDR4", "Radeon");

        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer3));

        System.out.println(computer1);
    }
}
