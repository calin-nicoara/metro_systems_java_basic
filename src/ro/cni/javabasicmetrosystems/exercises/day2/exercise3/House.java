package ro.cni.javabasicmetrosystems.exercises.day2.exercise3;

public class House implements Sellable {

    private String name;
    private int totalPrice, numberOfPeople;
    private boolean isForSale;

    public House(final String name, final int totalPrice, final int numberOfPeople, final boolean isForSale) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.numberOfPeople = numberOfPeople;
        this.isForSale = isForSale;
    }

    @Override
    public boolean isForSale() {
        return this.isForSale;
    }

    @Override
    public int getTotalPrice() {
        return this.totalPrice;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void addPerson() {
        this.numberOfPeople++;
    }

    public void removePerson() {
        this.numberOfPeople--;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
