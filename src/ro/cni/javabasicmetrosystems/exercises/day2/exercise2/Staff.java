package ro.cni.javabasicmetrosystems.exercises.day2.exercise2;

public class Staff extends Person{
    private String school;
    private String pay;

    public Staff(final String name, final String address, final String school, final String pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(final String school) {
        this.school = school;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(final String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return "Professor " + super.name;
    }
}
