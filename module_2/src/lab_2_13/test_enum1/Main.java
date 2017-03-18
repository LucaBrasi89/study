package lab_2_13.test_enum1;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */


/*
        1) Create a class Main with a main().
        2) Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY,
        MONDAY, ...).
        3) Add to method main() code that iterate over MyDayOfWeek enum possible values in
        loop and print each value name to console.
        4) Execute the program.

*/

public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {

            switch (day) {

                case SATURDAY:
                    System.out.println(day);
                    break;

                case SUNDAY:
                    System.out.println(day);
                    break;
            }
        }


    }
}
