package ro.cni.javabasicmetrosystems.live.day2;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(final int width, final int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return width * length;
    }

    public int getPerimitru() {
        return 2 * (width + length);
    }
}
