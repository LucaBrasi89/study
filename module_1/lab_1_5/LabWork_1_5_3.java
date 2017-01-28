package module_1.lab_1_5;

/**
 * Created by andrew on 21.01.17.
 */
public class LabWork_1_5_3 {

    public static void main(String[] args) {

//        do header
        System.out.print("* |");
        for (int i = 1; i <= 9; i++) {

            System.out.print(" "+ i);
        }
        System.out.println("\n------------------------------");
//        end of header
//        do string by string
        for (int i = 1; i <= 9; i++) {

            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {

                System.out.print(" "+ (i*j));

            }
//            jump to next line
            System.out.print("\n");


        }




    }
}
