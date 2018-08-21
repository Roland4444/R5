package Essentials.Implementations;

import Essentials.Specifications.inn;

import java.util.HashMap;
import java.util.Map;

public class inn_u extends inn {
    Map<Character, Integer> dictionary=new HashMap();
    public boolean isForeign=false;



    public inn_u(String value_){
        value = value_;
        this.isForeign=false;
    }

    public inn_u(String value_, boolean foreign){
        value = value_;
        this.isForeign=foreign;
    }

    public boolean control(){
        if (!isnumber(this.value))
            return false;
        if (!this.isForeign){
            if (this.value.length() != 10)
                return false;

            if ((this.value.charAt(0)=='0') && (this.value.charAt(1)=='0'))
                return false;
            return true;
        }
        if (this.value.length() != 5)
            return false;
        if (this.value.equals("00000"))
            return false;
        return true;
    }

    public boolean isnumber(String input){
        for (int i=0; i<input.length();i++){
            if (dictionary.get(input.charAt(i)) == null)
                return false;
        }
        return true;
    }

}
