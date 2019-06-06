package ro.cni.javabasicmetrosystems.exercises.day3.building;

import java.util.Comparator;

public class BuildingComparatorByCapacity implements Comparator {
    @Override
    public int compare(final Object o1, final Object o2) {
        Building b1 = (Building) o1;
        Building b2 = (Building) o2;
        if (b1.getCapacity() > b2.getCapacity()) {
            return 1;
        } else if (b1.getCapacity() < b2.getCapacity()) {
            return -1;
        } else {
            return 0;
        }
    }
}
