package model.letter;

import model.City;
import model.Inhabitant;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damien on 26/11/15.
 */
public class PromissoryNoteTest {

    @Test
    public void testDoAction() throws Exception {
        City city = new City("");
        PromissoryNote promissoryNote = new PromissoryNote(new Inhabitant(1, city), new Inhabitant(2, city), 5);

        assertEquals(5000, promissoryNote.getSender().getBankAccount().getAmount());
        assertEquals(5000, promissoryNote.getReceiver().getBankAccount().getAmount());
        promissoryNote.doAction();
        assertEquals(4995, promissoryNote.getSender().getBankAccount().getAmount());
        assertEquals(5004, promissoryNote.getReceiver().getBankAccount().getAmount());
    }
}