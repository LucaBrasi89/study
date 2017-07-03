package lab_2_13.test_enum3;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        21.03.17
 */
public class UseMyTrainShedule {

    public static void main(String[] args) {

        TrainShedule train = new TrainShedule();

        train.addTrain();
//      train.printTrain();
//        Едем в Киев, в среду
        train.searchTrain("Berlin","Kyiv", DayOfWeek.WEDNESDAY);

    }

    /*
    451 Kyiv Berlin 15:20 06:10 Sunday,Monday,Wednesday,Tuesday,Saturday
    452 Berlin Kyiv 11:09 19:52 Monday,Tuesday,Wednesday
    512 Kyiv Prague 23:42 06:10 Friday,Tuesday,Wednesday,Saturday,Sunday
    513 Prague Kyiv 17:04 03:41 Thursday,Wednesday,Friday,Sunday,Monday,Saturday
    */


}
