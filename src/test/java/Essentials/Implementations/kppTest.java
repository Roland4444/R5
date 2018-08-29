package Essentials.Implementations;

import Essentials.Implementations.reqs.kpp;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class kppTest {
    public Map<Character, Integer> dict = new HashMap();
    public kppTest(){
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

    @Test
    public void control() {
        kpp mock = new kpp("301501001");
        mock.dictionary=dict;
        assertEquals(0, mock.control());
        kpp mock2 = new kpp("1301501001");
        mock2.dictionary = dict;
        assertNotEquals(0, mock2.control());
        kpp mock3 = new kpp("1o01501001");
        mock3.dictionary = dict;
        assertNotEquals(0, mock3.control());
    }


}