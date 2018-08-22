package Essentials.Specifications;

import java.util.HashMap;
import java.util.Map;

public abstract class requisites {
    public boolean isnumber(String input){
        Map<Character, Integer> dictionary = new HashMap();
        dictionary.put('0',1);
        dictionary.put('1',1);
        dictionary.put('2',1);
        dictionary.put('3',1);
        dictionary.put('4',1);
        dictionary.put('5',1);
        dictionary.put('6',1);
        dictionary.put('7',1);
        dictionary.put('8',1);
        dictionary.put('9',1);

        for (int i=0; i<input.length();i++){
            if (dictionary.get(input.charAt(i)) == null)
                return false;
        }
        return true;
    }
}
