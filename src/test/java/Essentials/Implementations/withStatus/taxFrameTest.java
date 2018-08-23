package Essentials.Implementations.withStatus;

import Essentials.Dictionary.Dictionary4Requisites;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class taxFrameTest {
    Dictionary4Requisites dictdep = new Dictionary4Requisites();

    public taxFrameTest(){

    }



    @Test
    public void control() {
        taxFrame tf = new taxFrame("МС.01.2016", true);
        tf.dictTaxes=dictdep.dictTaxes;
        tf.dictNumbers=dictdep.dictNumbers;
        tf.halfDictTaxes=dictdep.halfDictTaxes;
        tf.monthDictTaxes=dictdep.monthDictTaxes;
        tf.qrDictTaxes=dictdep.qrDictTaxes;

        tf.control();
        assertEquals("МС", tf.abr_period);
        assertEquals("01", tf.period);
        assertEquals(0, tf.control());
        tf.value="М2.01.2016";
        assertNotEquals(0, tf.control());

    }

    @Test
    public void control1() {
    }
}