package Essentials.Implementations;

import Essentials.Implementations.reqs.inn_u;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class inn_uTest {

    public inn_uTest(){
        dict.put('0',1);
        dict.put('1',1);
        dict.put('2',1);
        dict.put('3',1);
        dict.put('4',1);
        dict.put('5',1);
        dict.put('6',1);
        dict.put('7',1);
        dict.put('8',1);
        dict.put('9',1);
    }

    public Map<Character, Integer> dict = new HashMap();

    @Test
    public void control() {
        inn_u inn = new inn_u("3015013456", false);
        inn.dictionary = dict;
        assertEquals(0,  inn.control());

        inn_u inn2 = new inn_u("32424243243242334242424");
        inn2.dictionary = dict;
        assertEquals(2, inn2.control());

        inn_u inn3 = new inn_u("123456", true);
        inn3.dictionary = dict;
        assertEquals(4, inn3.control());

        inn_u inn4 = new inn_u("12345", true);
        inn4.dictionary = dict;
        assertEquals(0, inn4.control());

        inn_u inn6 = new inn_u("3015i13456", false);
        inn6.dictionary = dict;
        assertEquals(1,  inn6.control());

    }


    @Test
    public void dic(){

        inn_u req = new inn_u("3015013456", false);
        req.dictionary = dict;
        assertEquals(true, req.isnumber("0"));
        assertEquals(true, req.isnumber("2"));
        assertEquals(true, req.isnumber("2213123"));
        assertEquals(false, req.isnumber("221312fffff3"));

    }

}