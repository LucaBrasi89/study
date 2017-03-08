package lab_2_10.testshapes;

import java.util.Comparator;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        01.03.17
 */
public class ShapeColorComparator implements Comparator<Shape> {


    @Override
    public int compare(Shape o1, Shape o2) {


        //        получим первые символы строки и сравним их
        char o1symb = o1.getShapeColor().charAt(0);
        char o2symb = o2.getShapeColor().charAt(0);

        if (o1symb > o2symb)
            return 1;
        else if (o1symb < o2symb)
            return -1;
        else
            return 0;

    }


}
