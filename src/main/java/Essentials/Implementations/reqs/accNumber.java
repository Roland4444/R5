package Essentials.Implementations.reqs;

import Essentials.Specifications.reqs.requisites;

import java.util.Map;

public class accNumber extends requisites {
    public accNumber(){

    }
    public accNumber(Map<Character, Integer> dict){
        this.dictionary=dict;

    }
    public int control(){
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 20)
            return 2;
        return 0;
    }
}
