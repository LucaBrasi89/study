package lab_2_1.lab_2_2_1;

/**
 * Created by andrew on 28.01.17.
 */
    /*Сочетает в себе задания 2.1.3 - 2.1.5*/


public class Computer {

    private String manufacturer;
    private int serialNumber;
    private double price;
    private int quantityCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    private int frequencyCPU;





    public int getFrequencyCPU() {

        return frequencyCPU;
    }


    public void view() {

        System.out.println("Manufacter: " + getManufacturer());
        System.out.println("Frequence: " + getFrequencyCPU());
        System.out.println("Price: " + getPrice() +" $\n\n");

    }



}
