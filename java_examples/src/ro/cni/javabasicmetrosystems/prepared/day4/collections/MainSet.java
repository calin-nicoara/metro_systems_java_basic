package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
//        typesOfSets();
        calculationsWithSets();
    }

    private static void calculationsWithSets() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 3));

        // Intersection
//        s1.retainAll(s2);
//        System.out.println(s1);

        // Union
//        s1.addAll(s2);
//        System.out.println(s1);

        s1.removeAll(s2);
        System.out.println(s1);
    }

    private static void typesOfSets() {
        //        Set<String> stringSet = new HashSet<String>(Arrays.asList("1432", "1433", "2235", "1342", "3211"));
//        Set<String> stringSet = new TreeSet<>(Arrays.asList("1432", "1433", "2235", "1342", "3211"));
        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList("1432", "1433", "2235", "1342", "3211"));

        System.out.println(stringSet);

        stringSet.add("1432");
        System.out.println(stringSet);
    }
}
