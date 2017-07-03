package lab_2_7.devices;

import java.util.Random;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        14.02.17
 */

/*Create classes:
        1) Base class Device (manufacturer(String), price(float), serialNumber(String));
        2) Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed
        (int), mac (String));
        Add getters/setters and constructor to each class*/

public class Device {

    private String manufacter;
    private float price;
    private String serialNumber;

    public Device(String manufacter, float price, String serialNumber) {

        setManufacter(manufacter);
        setPrice(price);
        setSerialNumber(serialNumber);
        hashCode();

    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacter='" + manufacter + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        if (other == null) {
            System.out.println("Objects is not equals ");
            return false;

        } else if (other == this) {

            System.out.println("Object is equals to each other");
            return false;

        } else if (other instanceof Device) {
            System.out.printf("%s is instance of Device but not same \n", other.getClass().getSimpleName());
            return true;
        } else {
            System.out.println("Objects is not equals ");
            return false;
        }

    }


    @Override
    public int hashCode() {

        Random rand = new Random();
        int result = (int) (31 * 100000 * rand.nextDouble());

        return result;

    }


}
