package lab_2_15.TestMyGenerator;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.04.17
 */
public class Main {

    public static void main(String[] args) {

        MyNumGenerator myGen = new MyNumGenerator(10,3);
        System.out.println("-------this is ArrayList demo-------");
        System.out.println(myGen.generate());
        System.out.println("\n-------this is SET demo-------");
        System.out.println(myGen.generateDistinct());
    }
}
