package model.letter;

import model.City;
import model.Inhabitant;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damien on 26/11/15.
 */
public class SimpleLetterTest {

    @Test
    public void testContentInside() throws Exception {
        City city = new City("");
        SimpleLetter simpleLetter = new SimpleLetter(new Inhabitant(1, city), new Inhabitant(2, city), "ok");

        assertEquals("a simple letter whose content is a text content ok", simpleLetter.contentInside());

    }
}