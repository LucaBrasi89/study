package lab_2_15.TestMap1;

import java.util.Scanner;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        02.04.17
 */

/*

        Create new project called TestMap1. Add package “com.brainacad.oop.testmap1”.
        1) Create a class MyTranslator with private field dictionary of HashMap<String,String>
        type. Add method addNewWord(String en, String ru), which add to dictionary new
        word in two languages.
        2) Add a new method translate(String en) which take some string in English, and returns
        its translation in Russian as the value of the type String.
        3) Create a class Main with a main() method. Add to method main() code creates
        instance of MyTranslator. Add code to fill MyTranslator with few en-rus words pair
        by invoking addNewWord() method.
        For example:
        “сat”, “кот”
        “mouse”, “мышь”
        ...
        4) Add code to read string from console and pass it into translate method. Print result to
        console.
        5) Execute the program.
        The program output must be like next example:
        cat caught mouse
        кот поймал мышь

 */


public class UseMyTranslator {

    public static void main(String[] args) {

        MyTranslator dict = new MyTranslator();
        dict.addNewWord("windshield","лобовое стекло");
        dict.addNewWord("head light","габаритные фонари");
        dict.addNewWord("hood","капот");
        dict.addNewWord("wheel","колесо");
        dict.addNewWord("bumper","бампер");

        Scanner sc = new Scanner(System.in);
        String input = "smth";
        String innerStr = "";
        String outerStr = "";
        System.out.println("enter empty string for loop interupting...\n\n");
        while (sc.hasNextLine()) {

            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            innerStr = innerStr + "  " + input;
            outerStr = outerStr + "  " + dict.translate(input);
        }
        System.out.println(innerStr);
        System.out.println("       |");
        System.out.println("       V");
        System.out.println(outerStr);
    }

}

