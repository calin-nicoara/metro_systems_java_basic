package ro.cni.javabasicmetrosystems.exercises.day2.exercise2;

public abstract class Person {
    protected String name;
    private String address;

    public Person(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    public abstract String getName();

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Personv2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
