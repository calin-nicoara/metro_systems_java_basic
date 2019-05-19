package ro.cni.javabasicmetrosystems.prepared.day2.oop_principles;

public class CandyFactory {

    int numberOfCandies;
    private String[] candyTypes = {"SWEET", "SOUR"};

    public CandyFactory(int numberOfCandies) {
        this.numberOfCandies = numberOfCandies;
    }

    public void makeCandyAndEatIt() {
        for(int i = 0; i < numberOfCandies; i++) {
            for(int j = 0; j < candyTypes.length; j++) {
                System.out.println("mmmmmmm yummy "
                        + candyTypes[j]);
            }
        }
    }
}
