package ro.cni.javabasicmetrosystems.prepared.day2.anonymous_classes;

public abstract class Quadrilateral {
    private int numberOfSides = 4;

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public abstract int getArea();
}
