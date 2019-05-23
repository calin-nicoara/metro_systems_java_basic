package ro.cni.javabasicmetrosystems.exercises.day2.exercise1;

public class MyFixedPoint {
    private int x = 0, y = 0;

    public MyFixedPoint() {
    }

    public MyFixedPoint(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(final int x, final int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(final MyFixedPoint another) {
        return Math.sqrt((another.getX() - this.x) * (another.getX() - this.x)
                + (another.getY() - this.y) * (another.getY() - this.y));
    }

    public double distance() {
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }

    public static double distance(final MyFixedPoint p1, final MyFixedPoint p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() -  p2.getX())
                + (p1.getY() -  p2.getY()) * (p1.getY() -  p2.getY()));
    }
}
