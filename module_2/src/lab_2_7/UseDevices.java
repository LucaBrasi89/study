package module_2.src.lab_2_7;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        14.02.17
 */

    /*  ====== LAB WORKS 2.7.1, 2.7.2 ======
    contain following classes Device.java, Monitor.java, EthernetAdapter.java
    */

public class UseDevices {


    public static void main(String[] args) {

        Device dev0 = new Device("Apple", 1000, "451-4E73");
        Device dev1 = new Device("Apple", 1000, "451-4E73");

        Monitor lcd1 = new Monitor("ASUS", 400, "3D920", 1920, 1080);
        Monitor lcd2 = new Monitor("ASUS", 400, "3D920", 1600, 1200);
        EthernetAdapter eth0 = new EthernetAdapter("ibm", 20, "qe1290", "20721:PE61", 100);
        EthernetAdapter eth1 = new EthernetAdapter("ibm", 20, "qe1290", "20721:PE61", 1000);

        /*Демонстрация перегруженного toString*/
        System.out.printf("%nПроверим перезаписанный toString%n________%n");
        System.out.println(dev0);
        System.out.println(lcd1);
        System.out.println(eth0);
        System.out.printf("%nПроверим перезаписанный equals%n________%n");
        lcd1.equals(eth0);
        lcd1.equals(lcd2);
        lcd1.equals(lcd1);



    }


}
