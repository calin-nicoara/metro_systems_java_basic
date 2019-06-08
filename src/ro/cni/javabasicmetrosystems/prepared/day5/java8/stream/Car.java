package ro.cni.javabasicmetrosystems.prepared.day5.java8.stream;

import java.util.Objects;

public class Car {
    private String brand;
    private Integer series;
    private String color;

    public Car(final String brand, final Integer series, final String color) {
        this.brand = brand;
        this.series = series;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(final Integer series) {
        this.series = series;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(series, car.series) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, series, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }
}
