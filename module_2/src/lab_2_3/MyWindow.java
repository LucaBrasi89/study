package lab_2_3;

/**
 * Created by andrew on 02.02.17.
 */


    /*
    =====Laboratory work 2.3.1=====
        Создадим класс для дальнейшего порождения экземпляров в классе
        UseMyWindow

    =====Laboratory work 2.3.2=====
        Создать конструктор без параметров для дефолтной инициализации.

    =====Laboratory work 2.3.3=====
            Создать два конструктора с разными сигнатурами
    */


public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {

        this.width = 1600;
        this.height = 1200;
        this.numberOfGlass = 19;
        this.color = "orange";
        this.isOpen = false;

    }

    public MyWindow(double width, double height) {

        this.width = width;
        this.height = height;

    }

    public MyWindow(double width, double height, int numberOfGlass) {

        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;

    }


    public MyWindow(double width, double height, int numberOfGlass, String color,
                    boolean isOpen) {

        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
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
