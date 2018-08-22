package Essentials.Implementations.withStatus;

import org.junit.Test;

import static org.junit.Assert.*;

public class taxFrameTest {

    @Test
    public void control() {
        taxFrame tf = new taxFrame("МС.01.2016", true);
        tf.control();
        assertEquals("МС", tf.abr_period);
        assertEquals("01", tf.period);

    }
}