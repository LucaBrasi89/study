package module_2.src.lab_2_7.devices;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        14.02.17
 */
public class EthernetAdapter extends Device {

    private String mac;
    private int speed;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public EthernetAdapter(String manufacter, float price, String serialNumber, String mac, int speed) {

        super(manufacter, price, serialNumber);
        setMac(mac);
        setSpeed(speed);

    }


    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "manufacter='" + getManufacter() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "mac='" + mac + '\'' +
                ", speed=" + speed +
                '}';
    }




}
