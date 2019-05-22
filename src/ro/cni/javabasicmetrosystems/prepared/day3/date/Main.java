package ro.cni.javabasicmetrosystems.prepared.day3.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        oldDateClass();
//        localDate();
//        localTime();
//        zoneDateTime();
//        period();
//        duration();
//        formatting();
        compatiblity();
    }

    private static void oldDateClass() {
        Date d1 = new Date();
        System.out.println("Current date is " + d1);
        Date d2 = new Date(2323223232L);
        System.out.println("Date represented is "+ d2 );

        System.out.println(d1.after(d2));
        System.out.println(d1.before(d2));

        d2.setTime(204587433443L);
        System.out.println(d2);
    }

    private static void localDate() {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2015, 2, 20));
        System.out.println(LocalDate.parse("2018-01-02"));

        // operation
        System.out.println();
        System.out.println(LocalDate.now().plusDays(2));
        System.out.println(LocalDate.parse("2018-01-02").getDayOfMonth());
        System.out.println(LocalDate.parse("2018-01-02").getMonth());
        System.out.println(LocalDate.parse("2018-01-02").getYear());

        System.out.println(LocalDate.now().isLeapYear());
    }

    private static void localTime() {
        System.out.println();
        System.out.println(LocalTime.now());

        System.out.println(LocalTime.now().getHour());
    }

    private static void localDateTime() {
        final LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.toLocalDate());

        System.out.println(now.getDayOfMonth());
    }

    private static void zoneDateTime() {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        final LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zoneId);

        System.out.println(zonedDateTime);
        System.out.println(ZoneId.getAvailableZoneIds());
    }

    private static void period() {
        LocalDate l1 = LocalDate.now();
        LocalDate l2 = l1.plusDays(5);

        final Period between = Period.between(l1, l2);

        System.out.println(between);
    }

    private static void duration() {
        LocalTime l1 = LocalTime.now();
        LocalTime l2 = l1.plusHours(4);

        System.out.println(Duration.between(l1, l2));
    }

    private static void formatting() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
    }

    private static void compatiblity() {
        final LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());

        System.out.println(localDateTime);
    }
}
