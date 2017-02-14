package lab_2_7.Zoo;

import java.util.Arrays;

/**
 * Created by andrew on 12.02.17.
 */
public class Animal {

    public static Animal[] animalArr = new Animal[0];


    public String foodName;




    public void addAnimalToArray(Animal an) {

        int newAnimalLength = ((int) animalArr.length) + 1;
        animalArr = Arrays.copyOf(animalArr, newAnimalLength);
        animalArr[animalArr.length - 1] = an;

    }


    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        System.out.printf("%s is eating %s \n", this.getClass().getSimpleName()
                ,this
                .foodName);
        return foodName;
    }


}
