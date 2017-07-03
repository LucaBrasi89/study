package lab_2_13.test_enum1;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */
public enum MyDayOfWeek {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;




    public void nextDay(int curDay) {

        MyDayOfWeek[] week = MyDayOfWeek.values();
        if (curDay == week.length-1) {
            curDay = 0;
        }
        System.out.println(week[curDay + 1]);

    }
}
