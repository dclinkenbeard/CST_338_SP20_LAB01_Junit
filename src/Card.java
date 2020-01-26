/**
 * This is a class designed to represent a playing card.
 * The suit values should PROBABLY be set in an ENUM but we will add that later.
 * <br>
 * <p>This object is known as a POJO or a Plain Old Java Object. It represents a piece of data,
 * in this case a single playing card.
 */
public class Card {
    private Integer value;
    private String suit;

    /**
     * This is the only constructor.
     * @param value the numerical value of the card.
     * @param suit this is the 'class' of the card (Club, Diamond, Heart, Spade)
     */
    public Card(Integer value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    /** returns the value  of the card*/
    public Integer getValue() {
        return value;
    }

    /** sets the value of the card... this should really be deprecated since
     * once the value is set, it shouldn't change... Unless we are playing sabaac
     * @param value the value to set for the card.
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This is an interesting method. It uses a switch statement to convert the numerical
     * value (1-13) to a string representation. This is interesting because cards 1,11,12, and 13
     * have special names (ace, jack, queen, king).
     *
     * @return a string representation of the value.
     */
    public String getStringValue(){
        switch(value){
            case 1:
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return value.toString();
        }
    };
    /** returns the suit of the card. or possible the suite */
    public String getSuit() {
        return suit;
    }

    /** sets the suit of the card. Like 'setValue' this should probably be deprecated. */
    public void setSuit(String suit) {
        this.suit = suit;
    }

//    TODO: Override the toString method to display "{value} of {suit}"
}
