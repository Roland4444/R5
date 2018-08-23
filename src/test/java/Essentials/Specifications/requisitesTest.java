package Essentials.Specifications;

import Essentials.Specifications.reqs.requisites;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class requisitesTest {
    public Map<Character, Integer> dict = new HashMap();
    public requisitesTest(){
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
    public void isnumber() {
        testreq req = new testreq();
        req.dictionary=dict;
        assertEquals(true, req.isnumber("0"));
        assertEquals(true, req.isnumber("2"));
        assertEquals(true, req.isnumber("2213123"));
        assertEquals(false, req.isnumber("221312fffff3"));
    }

    class testreq extends requisites {
        public int control(){
            return 0;
        }

    }
}