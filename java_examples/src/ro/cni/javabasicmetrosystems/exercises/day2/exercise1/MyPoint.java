package ro.cni.javabasicmetrosystems.exercises.day2.exercise1;

public class MyPoint {
    private int x = 0, y = 0;

    public MyPoint() {
    }

    public MyPoint(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(final int x, final int y) {
        final int xDiff = x - this.x;
        final int yDiff = y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(final MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0, 0);
    }

    public static double distance(final MyPoint p1, final MyPoint p2) {
        return p1.distance(p2);
    }
}
