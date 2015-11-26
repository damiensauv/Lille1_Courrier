package model.letter;

import model.City;
import model.Inhabitant;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class ThanksLetterTest {

    @Test
    public void testDisplayMessage() throws Exception {
        City city = new City("");
        new ThanksLetter(new Inhabitant(1, city), new Inhabitant(2, city), "money").displayMessage();
    }
}