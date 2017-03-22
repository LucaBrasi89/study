package lab_2_13.test_enum3;

import lab_2_13.test_enum1.MyDayOfWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static lab_2_13.test_enum1.MyDayOfWeek.SUNDAY;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        21.03.17
 */

/*

     ==== Lab 2.13.5 ====

    Create new project called TestEnum3. Add package “com.brainacad.oop.testenum3”.
Create a class TrainSchedule which contains inner class Train.
        1) Add to class Train six fields: number (of int type), stationDispatch (of String type),
        stationArrival (of String type), timeDispatch (оf String type), timeArrival (of String
        type) and days (array of enum type DayOfWeek, containing a list of days of the week),
        constructor with one parameter (number train) and getters/setter for each class field.
        Override the toString() method in Train to return all information about train.
        2) Add to class TrainSchedule private field trains as array of Train and constructor with
        one parameter to allocate memory to the schedule.
        3) Add to class TrainSchedule public method addTrain() without parameters, which read
        from console (using System.in and Scanner) all information on train, then to create
        new Train object and pass it to next available array element.
        4) Add to class TrainSchedule public method printTrains() which iterates over trains
        array in loop and print all information of each train to console.
        5) Add to class TrainSchedule public method searchTrain(...) with three parameters, of
        String type (stationDispatch, stationArrival ) and of DayOfWeek enum type, which
        searches and print all trains that go to the destination after a specified day of the
        week.
        6) Create a class Main with a main() method. Add to method main() code that creates
        TrainSchedule object and fill fills it the several trains. Add code to invoke printTrains()
        method, then code to invoke searchTrain() method.

 */


public class TrainShedule {

    ArrayList<Train> trains = new ArrayList<Train>();

    public TrainShedule() {

    }

    class Train {

        private int number;
        private String stationDispatch;

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + days +
                    '}';
        }

        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private ArrayList<DayOfWeek> days;


        public Train(int number) {

            this.number = number;
            this.days = new ArrayList<>();
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        //      парсит введенные дни недели и добавляет их в массив days
        public void setTrainDay(String daysOfWeekRaw) {

            String[] splitted = daysOfWeekRaw.split(",");
            for (String substring : splitted) {

                switch (substring) {

                    case ("Monday"):
                        days.add(DayOfWeek.MONDAY);
                        break;
                    case ("Tuesday"):
                        days.add(DayOfWeek.TUESDAY);
                        break;
                    case ("Wednesday"):
                        days.add(DayOfWeek.WEDNESDAY);
                        break;
                    case ("Thursday"):
                        days.add(DayOfWeek.TUESDAY);
                        break;
                    case ("Friday"):
                        days.add(DayOfWeek.FRIDAY);
                        break;
                    case ("Saturday"):
                        days.add(DayOfWeek.SATURDAY);
                        break;
                    case ("Sunday"):
                        days.add(DayOfWeek.SUNDAY);
                        break;
                }
            }
        }
    }

    public void addTrain() {

        Scanner sc = new Scanner(System.in);
        boolean reading = true;
        while (reading) {

            System.out.println("number, stationDispatch, stationArrival, timeDispatch, timeArrival, days");
            String input = sc.nextLine();
            if (input.matches("")) {
                reading = false;
                break;
            }
            String[] splitted = input.split("\\s+");
//            создадим объект поезда и передадим туда номер
            Train curTrain = new Train(Integer.parseInt(splitted[0]));
            curTrain.setStationDispatch(splitted[1]);
            curTrain.setStationArrival(splitted[2]);
            curTrain.setTimeDispatch(splitted[3]);
            curTrain.setTimeArrival(splitted[4]);
            curTrain.setTrainDay(splitted[5]);

            trains.add(curTrain);

        }
    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day) {

        for (Train tr : trains) {

//          если пункт назначения нам подходит то ищем дальше
            if( tr.getStationArrival().equals(stationArrival) ) {

                for (DayOfWeek ableDays : tr.days) {

                    if (ableDays == day) {

                        System.out.printf("\nЯ нашел тебе поезд, его номер %d, он идет в %s," +
                        " посадка в %s", tr.number, tr.getStationArrival(), tr.getTimeDispatch());
                    }
                }
            }
        }
    }

    public void printTrain() {

        for (Train tr : trains) {
            System.out.println(tr);
        }
    }
}
