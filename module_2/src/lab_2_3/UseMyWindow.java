package lab_2_3;

import java.lang.reflect.Array;

/**
 * Created by andrew on 02.02.17.
 */
public class UseMyWindow {

    public static void main(String[] args) {


        /*Проделаем полную инициализацию*/
        MyWindow window1 = new MyWindow(1024,768,255, "black",true);
        window1.printFields();
        MyWindow window2 = new MyWindow(1024,768,240, "red",true);
        window2.printFields();
        MyWindow window3 = new MyWindow(1024,768,231, "white",true);
        window3.printFields();
        MyWindow window4 = new MyWindow(1024,768,100, "blue",true);
        window4.printFields();
        MyWindow window5 = new MyWindow(1024,768,73, "purple",true);
        window5.printFields();
        System.out.println();

        /*пропишем дефолтные значения. Вызваем конструкотор который обеспечивает дефолтные значения
        * для всех 5ти полей*/
        MyWindow window6 = new MyWindow();
        window6.printFields();
        System.out.println();

        /*проделаем инициализацию спомощью двух конструкторов*/
        System.out.println("\n\nинициализация сначала двух аргументов, а потом трёх\n");
        MyWindow window7 = new MyWindow(640,480);
        window7.printFields();
        MyWindow window8 = new MyWindow(640,480, 76);
        window7.printFields();


        System.out.println("\n\n\n\t\t\t МАССИВ ОБЪЕКТОВ ТИПА 'MyWindow2' \n");

        MyWindow2[] windows = new MyWindow2[3];

        /*проделаем инициализацию из двух конструкторов*/
        windows[0] =new MyWindow2();
        windows[1] =new MyWindow2(640,480);
        windows[2] =new MyWindow2(320,240,86);

//        делаем вывод каждого из объектов

        for (MyWindow2 obj : windows) {

            obj.printFields();

        }

    }


}
