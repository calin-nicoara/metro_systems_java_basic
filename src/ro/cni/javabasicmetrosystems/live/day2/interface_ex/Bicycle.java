package ro.cni.javabasicmetrosystems.live.day2.interface_ex;

public class Bicycle implements Transportation, ShopItem {
    @Override
    public void move() {
        System.out.println("Cycle cycle!");
    }

    @Override
    public int giveMeCurrentSpeed() {
        return 10;
    }

    @Override
    public double getPrice() {
        return 2000;
    }

    @Override
    public void superMethod() {

    }
}
