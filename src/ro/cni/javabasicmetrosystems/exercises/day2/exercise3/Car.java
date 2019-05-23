package ro.cni.javabasicmetrosystems.exercises.day2.exercise3;

public class Car implements Sellable {

    private String name;
    private int price, taxes;
    private boolean isForSale;

    public Car(final String name, final int price, final int taxes, final boolean isForSale) {
        this.name = name;
        this.price = price;
        this.taxes = taxes;
        this.isForSale = isForSale;
    }

    @Override
    public boolean isForSale() {
        return this.isForSale;
    }

    @Override
    public int getTotalPrice() {
        return this.price + this.price * this.taxes / 100;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
