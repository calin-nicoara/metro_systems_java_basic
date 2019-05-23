package ro.cni.javabasicmetrosystems.live.day3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
//        oldDate();
//        newDate();

        LocalDateTime localDateTime = LocalDateTime.now();
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localDateTime.format(dateTimeFormatter));

    }

    private static void newDate() {
        LocalDate localDate1 = LocalDate
                .of(2019, 2, 1);

        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.now();

        final LocalDate localDate = localDate1.plusMonths(1);

        System.out.println(localDate1.getYear());

        LocalTime localTime = LocalTime.of(10,
                2, 2);

        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

//        System.out.println(localDateTime);

        final Period between = Period.between(localDate1, localDate2);
//        System.out.println(between);

        final Duration between1 = Duration.between(localDateTime, LocalDateTime.now());

        System.out.println(between1);
    }

    private static void oldDate() {
        // Month starts from 0
        Date date1 = new Date();
//        System.out.println(date1);
        date1.setTime(100002220); // epoch time
//        System.out.println(date1.after(new Date()));
//        System.out.println(date1.before(new Date()));
//        System.out.println();

        Date date2 = new Date(100002220);

        System.out.println(date1.equals(date2));
    }
}
