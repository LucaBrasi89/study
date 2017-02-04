package module_2.src.lab_2_4;

/**
 * Created by andrew on 04.02.17.
 */
public class Calculation {

    public static void main(String[] args) {

        /*создаем мыссивы arr1 и arr2*/
        int[] arr1 = new int[20];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }

        int[] arr2 = new int[20];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }

        /*стоит посмотреть что вышло*/
        System.out.printf(" %20s  %20s\n", "arr1", "arr2");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%20d  %20d\n", arr1[i], arr2[i]);
        }

        MyMath.findMin(arr1);
        MyMath.findMax(arr2);

    }

}
