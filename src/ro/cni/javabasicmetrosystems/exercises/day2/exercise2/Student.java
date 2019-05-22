package ro.cni.javabasicmetrosystems.exercises.day2.exercise2;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(final String name, final String address, final String program,
                   final int year, final double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(final String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(final double fee) {
        this.fee = fee;
    }

    @Override
    public String getName() {
        return "Student " + super.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
