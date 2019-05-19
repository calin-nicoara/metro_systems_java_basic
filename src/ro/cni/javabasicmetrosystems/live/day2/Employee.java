package ro.cni.javabasicmetrosystems.live.day2;

import ro.cni.javabasicmetrosystems.live.day2.person.Person;

public class Employee extends Person {

    private double salariu;
    private int zileDeConcediu;

    public Employee(String nume, String CNP, String locDeNastere, double salariu, int zileDeConcediu) {
        super(nume, CNP, locDeNastere);
        this.salariu = salariu;
        this.zileDeConcediu = zileDeConcediu;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(final double salariu) {
        this.salariu = salariu;
    }

    public int getZileDeConcediu() {
        return zileDeConcediu;
    }

    public void setZileDeConcediu(final int zileDeConcediu) {
        this.zileDeConcediu = zileDeConcediu;
    }

    public void showSuperName() {
        System.out.println(super.nume);
    }

    @Override
    public String getNume() {
//        return super.getNume() + " de la angajat";
        return "Eu nu am nume, sunt angajat!";
    }

    @Override
    public String getDailySchedule() {
        return "Ma trezesc, ma spal, ma duc la munca, ma intorc acasa, si ma culc";
    }
}
