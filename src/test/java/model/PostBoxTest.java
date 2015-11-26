package model;

import model.letter.Letter;
import model.letter.SimpleLetter;
import org.junit.Test;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class PostBoxTest {

    @Test (expected = CannotAffordLetterException.class)
    public void testCannotPost() throws Exception {
        City city = new City("New York");
        Inhabitant sender = new Inhabitant(1, city);
        Inhabitant receiver = new Inhabitant(2, city);
        Letter letter = new SimpleLetter(sender, receiver, "Hey");
        letter.cost = sender.getBankAccount().getAmount() + 1;
        city.getPostBox().post(letter);
    }

    @Test
    public void testPost() throws Exception {
        City city = new City("New York");
        Inhabitant sender = new Inhabitant(1, city);
        Inhabitant receiver = new Inhabitant(2, city);
        city.getPostBox().post(new SimpleLetter(sender, receiver, "Hey"));
    }
}