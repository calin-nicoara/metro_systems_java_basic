package ro.cni.javabasicmetrosystems.live.day3;

import java.util.Objects;

public class Car2 {
    private int series;
    private int numberOfWheels;
    private int horsePower;

    public Car2(final int series, final int numberOfWheels, final int horsePower) {
        this.series = series;
        this.numberOfWheels = numberOfWheels;
        this.horsePower = horsePower;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(final int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(final int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Car2 car2 = (Car2) o;
        return series == car2.series &&
                numberOfWheels == car2.numberOfWheels &&
                horsePower == car2.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, numberOfWheels, horsePower);
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(final int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "series=" + series +
                ", numberOfWheels=" + numberOfWheels +
                ", horsePower=" + horsePower +
                '}';
    }

//    public int compareTo(Object o) {
//        final Car2 o1 = (Car2) o;
//        if(this.horsePower < o1.horsePower) {
//            return -1;
//        } else if(this.horsePower > o1.horsePower) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
}
