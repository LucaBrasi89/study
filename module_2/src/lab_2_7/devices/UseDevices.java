package lab_2_7.devices;

import java.util.Arrays;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        14.02.17
 */

    /*  ====== LAB WORKS 2.7.1, 2.7.2 ======
    contain following classes Device.java, Monitor.java, EthernetAdapter.java
    */

public class UseDevices {

    static Device[] devices = new Device[0];

    public static void addDevice(Device device) {

        devices = Arrays.copyOf(devices, (devices.length + 1));
        devices[devices.length-1] = device;

    }

    public static void main(String[] args) {

        /*Заполним девайсами массив*/
        addDevice(new Device("Apple", 1000, "451-4E73"));
        addDevice(new Device("Apple", 600, "451-4ED1"));
        addDevice(new Monitor("ASUS", 400, "3D920", 1920, 1080));
        addDevice(new Monitor("ASUS", 400, "3D920", 1600, 1200));
        addDevice(new EthernetAdapter("nec", 15, "1212:11dt", "415d5", 100));
        addDevice(new EthernetAdapter("nec", 35, "1292:aW7a", "9015e", 1000));

        for (Device dev :  devices) {
            System.out.println(dev);
            System.out.println(dev.hashCode());
            System.out.println("------");
        }
        System.out.println("\nпредадмися equals...\n");
        devices[0].equals(devices[0]);
        devices[3].equals(devices[4]);


    }


}
