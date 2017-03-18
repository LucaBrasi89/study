package lab_2_13.test_enum2;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        18.03.17
 */

/*

    Create new project called TestEnum2. Add package “com.brainacad.oop.testenum2”.
    Create a class Main with a main().
    Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART) and
    Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
    QUEEN, KING values}.
    Create class Card which has two private fields: cardSuit of Suit type and cardRank of
    Rank type. Add to Card constructor with cardSuit and cardRank arguments. In class Card
    override toString() method to return full name of card.
    In method main() create and fill (using nested loops) array of Card objects (standard 52-
    card deck).
    Add code which iterate over Card array and print full card name to console.

 */
public class CreateCardDeck {

    public static void main(String[] args) {

        for (Suit suit : Suit.values() ) {

            for (Rank rank : Rank.values() ) {

                Card c = new Card(suit, rank);
                System.out.println(c);

            }
            System.out.println("\n --- * --- --- * --- --- * ---\n");

        }


    }


}
