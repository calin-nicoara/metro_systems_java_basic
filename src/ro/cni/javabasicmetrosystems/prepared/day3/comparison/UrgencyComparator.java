package ro.cni.javabasicmetrosystems.prepared.day3.comparison;

import java.util.Comparator;

public class UrgencyComparator implements Comparator {
    @Override
    public int compare(final Object o1, final Object o2) {
        SimpleUrgency firstUrgency = (SimpleUrgency) o1;
        SimpleUrgency secondUrgency = (SimpleUrgency) o2;
        if(secondUrgency.getPriority() < firstUrgency.getPriority()) {
            return 1;
        } else if(secondUrgency.getPriority() > firstUrgency.getPriority()) {
            return -1;
        } else {
            return 0;
        }
    }
}
