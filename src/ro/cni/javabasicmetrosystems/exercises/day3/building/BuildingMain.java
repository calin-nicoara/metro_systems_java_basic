package ro.cni.javabasicmetrosystems.exercises.day3.building;

import java.time.LocalDate;
import java.util.Arrays;

public class BuildingMain {
    public static void main(String[] args) {
        Building[] buildings = {
                new Building(4, "Astoria Plus", 90, LocalDate.of(1980, 1, 1)),
                new Building(2, "Astoria", 80, LocalDate.of(1960, 1, 1)),
                new Building(1, "Empire State", 20, LocalDate.of(1850, 1, 1)),
                new Building(3, "Tate", 70, LocalDate.of(1980, 1, 1)),
        };

        Arrays.sort(buildings);
        System.out.println(Arrays.toString(buildings));
        System.out.println();

        Arrays.sort(buildings, new BuildingComparatorByCapacity());
        System.out.println(Arrays.toString(buildings));
        System.out.println();

        Arrays.sort(buildings, new BuildingComparatorByName());
        System.out.println(Arrays.toString(buildings));
        System.out.println();
    }
}
