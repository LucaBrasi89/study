package module_2.src.lab_2_7.devices;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        14.02.17
 */
public class Monitor extends Device {

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacter, float price, String serialNumber, int resolutionX, int resolutionY) {

        super(manufacter, price, serialNumber);
        setResolutionX(resolutionX);
        setResolutionX(resolutionY);

    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacter='" + getManufacter() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\'' +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }





}
