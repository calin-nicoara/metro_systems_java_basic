package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.*;

public class MainSortedSet {
    public static void main(String[] args) {
        sortedSet();
        sortedMap();
    }

    private static void sortedMap() {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

    }

    private static void sortedSet() {
        SortedSet<Integer> examples = new TreeSet<>(Arrays.asList(1, 10, 23, 42));

        final SortedSet<Integer> headSet = examples.headSet(20);
        System.out.println(headSet);

        final SortedSet<Integer> tailSet = examples.tailSet(20);
        System.out.println(tailSet);

        System.out.println(examples.last());
        System.out.println(examples.first());
    }
}
