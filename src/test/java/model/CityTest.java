package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class CityTest {

    @Test
    public void testGenerateInhabitants() throws Exception {
        City city = new City("London");
        city.generateInhabitants(10);
        assertEquals(10, city.inhabitants.size());
    }

    @Test
    public void testSendLetters() throws Exception {
        City city = new City("London");
        city.generateInhabitants(10);
        city.sendLetters();
        assertTrue(city.getPostBox().currentDay.size() > 0);
    }

    @Test
    public void testDistributeLetters() throws Exception {
        City city = new City("London");
        city.generateInhabitants(10);
        city.sendLetters();
        city.distributeLetters();
        assertEquals(0, city.getPostBox().currentDay.size());
    }
}