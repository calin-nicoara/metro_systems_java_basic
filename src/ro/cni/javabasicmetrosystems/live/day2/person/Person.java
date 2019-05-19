package ro.cni.javabasicmetrosystems.live.day2.person;

public abstract class Person {

    protected String nume;
    private String CNP;
    private String locDeNastere;

    public Person(final String nume, final String CNP, final String locDeNastere) {
        this.nume = nume;
        this.CNP = CNP;
        this.locDeNastere = locDeNastere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(final String nume) {
        this.nume = nume;
    }

    String getCNP() {
        return CNP;
    }

    public void setCNP(final String CNP) {
        this.CNP = CNP;
    }

    public String getLocDeNastere() {
        return locDeNastere;
    }

    public void setLocDeNastere(final String locDeNastere) {
        this.locDeNastere = locDeNastere;
    }

    public abstract String getDailySchedule();
}
