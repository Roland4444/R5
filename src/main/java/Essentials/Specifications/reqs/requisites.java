package Essentials.Specifications.reqs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class requisites implements Serializable {



    public String value=null;
    public Map<Character, Integer> dictionary;
    public abstract int control();
    public boolean isnumber(String input){
        for (int i=0; i<input.length();i++){
            if (dictionary.get(input.charAt(i)) == null)
                return false;
        }
        return true;
    }
    public int setValue(String value){
        this.value = value;
        return control();
    }
}
