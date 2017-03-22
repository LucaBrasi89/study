package lab_2_13.test_enum3;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */
public enum DayOfWeek {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;




    public void nextDay(int curDay) {

        DayOfWeek[] week = DayOfWeek.values();
        if (curDay == week.length-1) {
            curDay = 0;
        }
        System.out.println(week[curDay + 1]);

    }
}
