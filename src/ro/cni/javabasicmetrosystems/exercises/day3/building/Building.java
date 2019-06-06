package ro.cni.javabasicmetrosystems.exercises.day3.building;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

class Building implements Comparable, Serializable {
    private int constructionId;
    private String name;
    private int capacity;
    private LocalDate dateOfConstruction;

    public Building(final int constructionId, final String name, final int capacity, final LocalDate dateOfConstruction) {
        this.constructionId = constructionId;
        this.name = name;
        this.capacity = capacity;
        this.dateOfConstruction = dateOfConstruction;
    }

    public int getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(final int constructionId) {
        this.constructionId = constructionId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(final LocalDate dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Building building = (Building) o;
        return constructionId == building.constructionId &&
                capacity == building.capacity &&
                Objects.equals(name, building.name) &&
                Objects.equals(dateOfConstruction, building.dateOfConstruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constructionId, name, capacity, dateOfConstruction);
    }

    @Override
    public String toString() {
        return "Building{" +
                "constructionId=" + constructionId +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", dateOfConstruction=" + dateOfConstruction +
                '}';
    }

    @Override
    public int compareTo(final Object o) {
        Building otherBuilding = (Building) o;
        if (this.constructionId > otherBuilding.constructionId) {
            return 1;
        } else if (this.constructionId < otherBuilding.constructionId) {
            return -1;
        } else {
            return 0;
        }
    }
}
