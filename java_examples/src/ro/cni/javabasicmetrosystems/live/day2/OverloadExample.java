package ro.cni.javabasicmetrosystems.live.day2;

public class OverloadExample {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c +d);
    }

    void showMeTheMoney(String bank) {
        showMeTheMoney(bank, 0);
    }

    void showMeTheMoney(String bank, double money) {
        System.out.println("Money " + money + " in the bank:" + bank);
    }

    void showMeTheMoney(String bank, int money) {
        System.out.println("Money int " + money + " in the bank:" + bank);
    }
//   Does not work
//    int sum(int c, int d) {
//
//    }

    public static void main(String[] args) {
        OverloadExample overloadExample = new OverloadExample();

        overloadExample.showMeTheMoney("BCR", 10.0);
        overloadExample.showMeTheMoney("BCR", 10);
    }
}
