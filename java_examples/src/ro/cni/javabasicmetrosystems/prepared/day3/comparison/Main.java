package ro.cni.javabasicmetrosystems.prepared.day3.comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Simple urgency
        SimpleUrgency[] simpleUrgencies = {
                new SimpleUrgency(2),
                new SimpleUrgency(3),
                new SimpleUrgency(1)
        };
//        Arrays.sort(simpleUrgencies);
//
//        System.out.println(Arrays.toString(simpleUrgencies));


        // More complex urgencies
        Urgency[] urgencies = {
                new Urgency(2, 2),
                new Urgency(1, 1),
                new Urgency(1, 2),
                new Urgency(3,1)
        };

        Arrays.sort(urgencies);
        System.out.println(Arrays.toString(urgencies));

        // Implementing comparator
        Arrays.sort(simpleUrgencies, new UrgencyComparator());

        System.out.println(Arrays.toString(simpleUrgencies));
    }
}
