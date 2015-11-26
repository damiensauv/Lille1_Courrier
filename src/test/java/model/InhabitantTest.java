package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damien on 26/11/15.
 */
public class InhabitantTest {

    Inhabitant inhabitant;

    @org.junit.Before
    public void setUp() throws Exception {
        this.inhabitant = new Inhabitant(1, new City("Lille"));
    }

    @Test
    public void testGetCity() throws Exception {
        assertEquals("Lille", this.inhabitant.getCity().getName());
    }

    @Test
    public void testSetCity() throws Exception {
        this.inhabitant.setCity(new City("paris"));
        assertEquals("paris", this.inhabitant.getCity().getName());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("inhabitant-1", this.inhabitant.getName());
    }

    @Test
    public void testSetName() throws Exception {
        this.inhabitant.setName("damien");
        assertEquals("damien", this.inhabitant.getName());
    }

}