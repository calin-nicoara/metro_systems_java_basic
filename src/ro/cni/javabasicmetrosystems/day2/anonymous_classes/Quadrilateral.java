package ro.cni.javabasicmetrosystems.day2.anonymous_classes;

public abstract class Quadrilateral {
    private int numberOfSides = 4;

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public abstract int getArea();
}
