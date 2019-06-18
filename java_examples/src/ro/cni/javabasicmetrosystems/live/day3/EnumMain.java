package ro.cni.javabasicmetrosystems.live.day3;

import java.util.Arrays;

import ro.cni.javabasicmetrosystems.live.day3.enums.Day2;

public class EnumMain {
    public static void main(String[] args) {
        Day2 day = Day2.FUNDAY;

        switch(day) {
            case FUNDAY:
                System.out.println("It's funday!");
                break;
        }

        System.out.println(Day2.FUNDAY);
        System.out.println(Arrays.toString(Day2.values()));
        System.out.println(Day2.valueOf("FUNDAY"));

        System.out.println(Day2.MONDAY.getDayOfWeek());
    }
}
