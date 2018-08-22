package Essentials.Implementations;

import org.junit.Test;

import static org.junit.Assert.*;

public class inn_uTest {

    @Test
    public void control() {
        inn_u inn = new inn_u("3015013456", false);
        assertEquals(true,  inn.control());


        inn_u inn2 = new inn_u("32424243243242334242424");
        assertEquals(false, inn2.control());

        inn_u inn3 = new inn_u("123456", true);
        assertEquals(false, inn3.control());

        inn_u inn4 = new inn_u("12345", true);
        assertEquals(true, inn4.control());

        inn_u inn6 = new inn_u("3015i13456", false);
        assertEquals(false,  inn6.control());

    }


    @Test
    public void dic(){
        inn_u req = new inn_u("3015013456", false);
        assertEquals(true, req.isnumber("0"));
        assertEquals(true, req.isnumber("2"));
        assertEquals(true, req.isnumber("2213123"));
        assertEquals(false, req.isnumber("221312fffff3"));

    }

}