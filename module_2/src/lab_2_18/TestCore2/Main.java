package lab_2_18.TestCore2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        19.04.17

                                Lab Work 2-18-2

     Create new project called TestCore2. Add package “com.brainacad.oop.testcore2”.
     Write a program that counts how many nails can be purchased at $1 and what will
     surrender if they buy one of each kind of the nail (nails cost: $0.1, $0.2, $0.3, etc).

 */
public class Main {

    private static List<BigDecimal> nails = new ArrayList<BigDecimal>();

    private static void purchase(double moneyAmount) {

        int itemsBought = 0;
        BigDecimal change = new BigDecimal(moneyAmount);;
        for (BigDecimal nail : nails ) {
            change = change.subtract(nail);

            if(change.signum() < 0) {
                change = change.add(nail);
                System.out.print("nails bought: " + itemsBought + "\nchange: "
                        + change);

                break;
            } else {
                itemsBought++;

            }
        }
    }

    public static void main(String[] args) {

//        fill the nails array
        for (int i = 0; i < 20; i++) {

            if (Main.nails.size() == 0 ) {
                nails.add(BigDecimal.valueOf(0.1));
            } else {
                nails.add((nails.get(nails.size() - 1)).add(BigDecimal.valueOf(0.1)) );
            }
        }

//        количество денег которые в нашем распоряжении
        Main.purchase(6);
    }
}
