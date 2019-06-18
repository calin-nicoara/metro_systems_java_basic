package ro.cni.javabasicmetrosystems.live.day3;

import java.util.Comparator;

public class Car2ComparatorNumberofWheels implements Comparator {
    @Override
    public int compare(final Object o1, final Object o2) {
        

        final Car2 car1 = (Car2) o1;
        final Car2 car2 = (Car2) o2;
        if(car1.getNumberOfWheels() < car2.getNumberOfWheels()) {
            return -1;
        } else if(car1.getNumberOfWheels() > car2.getNumberOfWheels()) {
            return 1;
        } else {
            return 0;
        }
    }
}
