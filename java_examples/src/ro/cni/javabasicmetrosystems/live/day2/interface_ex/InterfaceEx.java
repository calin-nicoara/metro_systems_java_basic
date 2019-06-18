package ro.cni.javabasicmetrosystems.live.day2.interface_ex;

public class InterfaceEx {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        Transportation transportation = new Bicycle();
        ShopItem shopItem = new Bicycle();

        transportation.giveMeCurrentSpeed();

        shopItem.getPrice();

        doSomething(bicycle);

        //Very usefull for one method interfaces
        Transportation tras2 = new Transportation() {
            private String newVariable;

            @Override
            public void superMethod() {

            }

            @Override
            public void move() {

            }

            @Override
            public int giveMeCurrentSpeed() {
                return 0;
            }
        };
    }

    public static void doSomething(Transportation transportation) {
        System.out.println("I transport!");
    }
}
