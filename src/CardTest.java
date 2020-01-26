import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    Card card;
    Integer value;
    String suit;

    /**
     * The annotation @BeforeEach means this will be run before EACH test
     */
    @BeforeEach
    void setUp() {
        value = 1;
        suit = "Hearts";
        card = new Card(value,suit);
    }

    /**
     * This ensures that any changes we make are reveresed.
     */
    @AfterEach
    void tearDown() {
        card = null;
    }

    @Test
    void getValue() {
        assertEquals(value, card.getValue());
    }

    @Test
    void setValue() {
        int newValue = 2;

        assertEquals(value, card.getValue());
        card.setValue(newValue);
        assertNotEquals(value, card.getValue());
        assertEquals(newValue,card.getValue());
    }

    @Test
    void getStringValue() {
        String stringValue = "Ace";
        assertEquals(stringValue, card.getStringValue());
    }

    @Test
    void getSuit() {
        assertEquals(suit, card.getSuit());
    }

    @Test
    void setSuit() {
        String newSuit = "Clubs";

        assertEquals(suit, card.getSuit());

        card.setSuit(newSuit);
        assertNotEquals(suit, card.getSuit());
        assertEquals(newSuit,card.getSuit());
    }
}