package module_1.lab_1_5;

/**
 * Created by andrew on 21.01.17.
 */

/* Итерировать с инкрементом в единицу от 1 до 300. Выводить только которые
делятся на 3 и 4. Прервать цикл после 10 выведенных резов. */


public class LabWork_1_5_4 {

    public static void main(String[] args) {

        int counter = 0;
        for (int i=1; i <= 300; i++) {

            if (counter == 10) {
                break;
            }
            if ( ((i % 3) == 0) || ((i % 4) == 0) ) {

                counter++;
                System.out.printf("This is iteration %2d - value is %2d\n",
                counter, i);



            }

        }



    }
}
