package lab_1_9;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.06.17
 */
public class Main {

    public static void main(String[] args) {

        Calculate calculate = (Calculate) CalculateProxy.newInstance(Calculate.class);
        if (calculate != null) {
            int num_1 = 100,
                    num_2 = 5;
            System.out.println("number_1 = " + num_1 + "; number_2 = " + num_2);
            System.out.println("1) mult -> " + calculate.multiplication(num_1, num_2));
            System.out.println("2) div -> " + calculate.division(num_1, num_2));
        }

        System.out.println("-------------------------------");
        CalculateBitwise calc = (CalculateBitwise)calculate;
        if (calc != null) {
            int number_1 = 15,
                    number_2 = 35;
            System.out.println("number_1 = " + number_1 + "; number_2 = " + number_2);
            System.out.println("3) or -> " + calc.orBitwise(number_1, number_2));
            System.out.println("4) and -> " + calc.andBitwise(number_1, number_2));
        }
    }

    }


