package lab_2_12;

/**
 * Created by andrew on 12.03.17.
 */
public class UseMyPhone {

    public static void main(String[] args) {

        MyPhone andrewPhone = new MyPhone();
        andrewPhone.switchOn();
        andrewPhone.phoneBook.sortByName();
        andrewPhone.call(4);
        andrewPhone.call(7);


//        phNumb.sortByPhoneNumber();



    }

}
