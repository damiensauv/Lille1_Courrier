package model.letter;

import model.City;
import model.Inhabitant;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class AcknowledgeOfReceiptTest {

    @Test
    public void testConstructor() throws Exception {
        City city = new City("jack");
        new AcknowledgeOfReceipt(new Inhabitant(4, city), new Inhabitant(3, city), "");
    }
}