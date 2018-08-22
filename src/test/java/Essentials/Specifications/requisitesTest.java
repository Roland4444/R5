package Essentials.Specifications;

import org.junit.Test;

import static org.junit.Assert.*;

public class requisitesTest {

    @Test
    public void isnumber() {
        testreq req = new testreq();
        assertEquals(true, req.isnumber("0"));
        assertEquals(true, req.isnumber("2"));
        assertEquals(true, req.isnumber("2213123"));
        assertEquals(false, req.isnumber("221312fffff3"));
    }

    class testreq extends requisites{

    }
}