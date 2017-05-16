package lab_1_7.TDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by andrew on 06.05.17.
 */
public class Main {
    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1989, 01, 30);

        System.out.println(curDate.until(birthDay));

        Period per = Period.between(birthDay, curDate);
        System.out.println("I am " + per.getYears() + " years old");
        System.out.println("This is day of week of my birthday in 89th: " +
                birthDay.getDayOfWeek());
        LocalDate thisYearbithday = birthDay.plusYears(28);
        System.out.println("This is day of week of my birthday in this year: " +
                thisYearbithday.getDayOfWeek());

        Period betweenMyBirthday = Period.between(curDate, thisYearbithday);
//        check on birthDay in this year, was or wasn\'t'
        if (betweenMyBirthday.isNegative()) {
            System.out.println("birth passed");

        }


//        choosing of timezones, specify formats and output it
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy, HH-mm-ss");

        LocalDateTime tokyo = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Tokyo"));
        LocalDateTime losAngeles = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"));
        LocalDateTime helsinki = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Helsinki"));

        System.out.println("Tokyo " + formatter.format(tokyo));
        System.out.println("Los Angeles " + formatter.format(losAngeles));
        System.out.println("Helsinki " + formatter.format(helsinki));
    }
}
