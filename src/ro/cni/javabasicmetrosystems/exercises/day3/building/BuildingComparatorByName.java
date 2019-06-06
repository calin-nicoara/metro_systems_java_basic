package ro.cni.javabasicmetrosystems.exercises.day3.building;

import java.util.Comparator;

public class BuildingComparatorByName implements Comparator {
    @Override
    public int compare(final Object o1, final Object o2) {
        String name1 = ((Building) o1).getName();
        String name2 = ((Building) o2).getName();

        for(int i = 0; i < name1.length() && i < name2.length(); i++) {
            if(name1.charAt(i) > name2.charAt(i)) {
                return 1;
            } else if(name1.charAt(i) < name2.charAt(i)) {
                return -1;
            }
        }

        if(name1.length() > name2.length()) {
            return 1;
        } else if(name1.length() < name2.length()) {
            return -1;
        }

        return 0;
    }
}
