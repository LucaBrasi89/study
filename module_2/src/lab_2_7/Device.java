package module_2.src.lab_2_7;

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

        } else if (other instanceof Device)
        {
            System.out.println("Objects is equals ");
            return true;
        } else {
            System.out.println("Objects is not equals ");
            return false;
        }

    }

}
