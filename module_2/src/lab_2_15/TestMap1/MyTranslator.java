package lab_2_15.TestMap1;

import java.util.HashMap;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        02.04.17
 */
public class MyTranslator {

    private HashMap<String,String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {

        dictionary.put(en, ru);
    }

    public String translate(String en) {

        return (dictionary.get(en));

    }


}
