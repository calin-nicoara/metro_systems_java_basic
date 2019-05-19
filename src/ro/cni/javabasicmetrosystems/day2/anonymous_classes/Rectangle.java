package ro.cni.javabasicmetrosystems.day2.anonymous_classes;

public class Rectangle extends Quadrilateral {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
