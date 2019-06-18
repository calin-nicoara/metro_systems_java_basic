package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
//        basicMapOperations();

        Map<String, Integer> map = new HashMap<>();

        map.put("key", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }

    private static void basicMapOperations() {
        Map<String, Integer> map = new HashMap<>();

        map.put("KEY", 20);
        map.put("KEY2", 10);
        map.put("KEY2", 11);

        map.put(null, -1);

        System.out.println(map);
        System.out.println(map.get("KEY"));
        System.out.println(map.get(null));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("KEY3", 22);

        map.putAll(map2);
        System.out.println(map);

        map.remove("KEY3");
        System.out.println(map);
    }
}
