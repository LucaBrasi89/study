package lab_2_7.Zoo;


import lab_2_7.Zoo.Mammal.*;



/**
 * Created by andrew on 12.02.17.
 */
public class Zoo {

    public static void main(String[] args) {

        Animal zoo = new Animal();
        zoo.addAnimalToArray(new Tiger());
        zoo.addAnimalToArray(new Lion());
        zoo.addAnimalToArray(new Elephant());
        zoo.addAnimalToArray(new Cats());
        zoo.addAnimalToArray(new MonkeyStyle());
        zoo.addAnimalToArray(new Monkey());


        for (Animal an  : Animal.animalArr) {

            an.getFoodName();

        }


    }

}
