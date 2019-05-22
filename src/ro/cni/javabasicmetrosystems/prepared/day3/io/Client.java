package ro.cni.javabasicmetrosystems.prepared.day3.io;

import java.util.Objects;

public class Client {

    private long id;
    private String name;
    private String email;
    private String phonenumber;
    private boolean active;
    private String dateOfBirth;

    public Client(final long id, final String name, final String email,
                  final String phonenumber, final boolean active, final String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.active = active;
        this.dateOfBirth = dateOfBirth;
    }

    public Client() {}

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(final String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Client client = (Client) o;
        return id == client.id &&
                active == client.active &&
                Objects.equals(name, client.name) &&
                Objects.equals(email, client.email) &&
                Objects.equals(phonenumber, client.phonenumber) &&
                Objects.equals(dateOfBirth, client.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phonenumber, active, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", active=" + active +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
