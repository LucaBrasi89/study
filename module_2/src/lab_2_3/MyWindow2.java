package lab_2_3;

/**
 * Created by andrew on 02.02.17.
 */


    /*
    =====Laboratory work 2.3.4=====
            Осуществить вызов первого конструктора со второго через this
    */

    /*
    =====Laboratory work 2.3.5=====
            Создать массив объектов и повызывать разные конструкторы
    */

public class MyWindow2 {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;


    public MyWindow2() {

        this.width = 1600;
        this.height = 1200;
        this.numberOfGlass = 19;
        this.color = "orange";
        this.isOpen = false;

    }


    public MyWindow2(double width, double height) {

        this();
        this.width = width;
        this.height = height;

    }

    public MyWindow2(double width, double height, int numberOfGlass) {

        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;

    }

    public void printFields() {

        System.out.println(
                "MyWindow{" +
                        "width=" + width +
                        ", height=" + height +
                        ", numberOfGlass=" + numberOfGlass +
                        ", color='" + color + '\'' +
                        ", isOpen=" + isOpen +
                        '}'

        );


    }

}
