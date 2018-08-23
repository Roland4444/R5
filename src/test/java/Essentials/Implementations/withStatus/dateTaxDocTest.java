package Essentials.Implementations.withStatus;

import Essentials.Dictionary.Dictionary4Requisites;
import org.junit.Test;

import static org.junit.Assert.*;

public class dateTaxDocTest {
    Dictionary4Requisites dictdep = new Dictionary4Requisites();

    @Test
    public void control() {
        dateTaxDoc dt= new dateTaxDoc("10.02.1992", true);
        assertEquals(0, dt.control());


        dateTaxDoc dt2= new dateTaxDoc("10.555.1992", true);
        assertNotEquals(0, dt2.control());

    }
}