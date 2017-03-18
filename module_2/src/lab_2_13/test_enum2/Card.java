package lab_2_13.test_enum2;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */
public class Card {

    private Suit suit;
    private Rank rank;


    public Card(Suit suit, Rank rank) {

        this.suit = suit;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return ("The " + rank + " of " + suit);
    }
}
