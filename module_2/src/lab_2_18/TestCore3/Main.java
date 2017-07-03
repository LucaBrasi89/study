package lab_2_18.TestCore3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        20.04.17
 *
 *                        Lab Work 2-18-3
 *
 *       Create new project called TestCore3. Add package “com.brainacad.oop.testcore3”.
 *       Write a program that demonstrates use of regional settings to work with numbers,
 *       currency and date (using Locale, NumberFormat, Currency and Date).
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        BigInteger val = BigInteger.valueOf(2_430_000_000_000l);
        BigDecimal val2 = BigDecimal.valueOf(0.002);
        DateFormat dateFormat = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

//        UKRAINE
        System.out.println("Current locale: " + Locale.getDefault());
        System.out.println("Integer: " + val);
        System.out.println("Decimal: " + val2);
        System.out.println("Currency: " +
                 " " + val2 + " " + Currency.getInstance(Locale.getDefault()));
        System.out.println("Date: " + dateFormat.format(date) + "\n\n");

//        ITALY

        Locale.setDefault(Locale.ITALY);

        System.out.println("Current locale: " + Locale.getDefault());
        System.out.println("Integer: " + val);
        System.out.println("Decimal: " + val2);
        System.out.println("Currency: " +
                " " + val2 + " " + Currency.getInstance(Locale.getDefault()));
        System.out.println("Date: " + dateFormat.format(date) + "\n\n");

//        CHINA

        Locale.setDefault(Locale.CHINA);
        System.out.println("Current locale: " + Locale.getDefault());
        System.out.println("Integer: " + val);
        System.out.println("Decimal: " + val2);
        System.out.println("Currency: " +
                " " + val2 + " " + Currency.getInstance(Locale.getDefault()));
        System.out.println("Date: " + dateFormat.format(date) + "\n\n");

    }

}
