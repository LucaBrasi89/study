package lab_1_9;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.06.17
 */
public class Main {

    public static void main(String[] args) {

        Calculate calc = new CalculateImpl();
        System.out.println("wihoout proxy");
        System.out.println(calc.division(221, 21));
        System.out.println(calc.multiplication(32, 15));
        System.out.println("\n\nafter using proxies:\n");
        Calculate proxiedCalc = (Calculate) CalculateProxy.newInstance(calc);
        System.out.println(proxiedCalc.division(100, 9));
        System.out.println(proxiedCalc.multiplication(12, 52));

    }

}
