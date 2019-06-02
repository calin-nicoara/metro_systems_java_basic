package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.*;

public class MainList {
    private static List<String> mainList = new ArrayList<>(Arrays.asList("40", "10", "20", "30"));

    public static void main(String[] args) {
//        basicMethods();
//        positionalAndSearch();

//        listIterator();

//        subList();
        collectionsUtilMethods();
    }

    private static void collectionsUtilMethods() {
//        sort, shuffle, reverse, rotate, swap, replaceAll, fill, copy, binarySearch, indexOfSubList, lastIndexOfSubList,
        Collections.sort(mainList);
        System.out.println(mainList);

//        Collections.shuffle(mainList);
//        System.out.println(mainList);

        Collections.reverse(mainList);
        System.out.println(mainList);

        Collections.rotate(mainList, 1);
        System.out.println(mainList);

        Collections.swap(mainList, 1, 3);
        System.out.println(mainList);

        Collections.replaceAll(mainList, "10", "20");
        System.out.println(mainList);

        Collections.fill(mainList, "99");
        System.out.println(mainList);
    }


    private static void subList() {
        final List<String> subList = mainList.subList(0, 2);
//        subList.clear();

        subList.set(0, "NEW 10");

        System.out.println(mainList);
    }

    private static void listIterator() {
        final ListIterator<String> stringListIterator = mainList.listIterator();

        System.out.println("List iterator next");
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.nextIndex());
            System.out.println(stringListIterator.previousIndex());

            final String next = stringListIterator.next();
            System.out.println(next);
        }

        System.out.println("List iterator previous");
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.nextIndex());
            System.out.println(stringListIterator.previousIndex());

            System.out.println();
            stringListIterator.previous();
        }
    }

    private static void positionalAndSearch() {
        System.out.println(mainList.get(0));

        mainList.set(2, "30 enhanced");
        System.out.println(mainList.get(2));

        System.out.println(mainList.indexOf("30 enhanced"));

        String enhancedString = new String("30 enhanced");
        System.out.println(mainList.indexOf(enhancedString));
    }

    private static void basicMethods() {
        mainList.add("40");
        mainList.remove(2);
        mainList.remove("40");

        System.out.println(mainList);
    }
}
