package Essentials.Implementations;

import Essentials.Dictionary.Dictionary4Requisites;
import org.junit.Test;

import static org.junit.Assert.*;

public class typePaymentTest {
    Dictionary4Requisites dp = new Dictionary4Requisites();

    @Test
    public void control() {
        typePayment tp = new typePayment("01");
        tp.dictionary = dp.dictNumbers;
        assertEquals(0, tp.control());
        tp.value="6787";
        assertNotEquals(0, tp.control());
    }
}