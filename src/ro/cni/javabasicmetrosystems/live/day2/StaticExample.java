package ro.cni.javabasicmetrosystems.live.day2;

public class StaticExample {

    static int staticVar = 0;

    int a = 0;
    int b = 0;

    StaticExample() {}

    StaticExample(int a1, int b1) {
        a = a1;
        b = b1;
        staticVar++;
    }

    StaticExample(int a1) {
        a = a1;
    }

    void nonStaticSum() {
        System.out.println(a + b + staticVar);
    }

    static void staticSum() {
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample(1, 2);
        staticExample.a = 1;

        StaticExample staticExample2 = new StaticExample(2, 5);
        staticExample2.a = 2;

        StaticExample staticExample3 = new StaticExample(5, 6);

        StaticExample.staticSum();
    }
}
