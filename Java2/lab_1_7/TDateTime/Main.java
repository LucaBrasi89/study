package lab_1_7.TDateTime;

import java.time.LocalDate;
import java.time.Period;
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
        System.out.println("I am " + per.getYears()+ " years old");
        System.out.println("This is day of week of my birthday in 89th: " +
                birthDay.getDayOfWeek());
        LocalDate thisYearbithday = birthDay.plusYears(28);
        System.out.println("This is day of week of my birthday in this year: " +
                thisYearbithday.getDayOfWeek());

        Period betweenMyBirthday = Period.between(curDate,thisYearbithday);
//        check on birthDay in this year, was or wasn\'t'
        if (betweenMyBirthday.isNegative()) {
            System.out.println("birth passed");

        }

    }

}
