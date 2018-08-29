package Essentials.Implementations.reqs;

import Essentials.Specifications.reqs.requisites;

public class kpp extends requisites {
    public kpp(){

    }
    public kpp(String value){
        this.value = value;
    }


    public int control(){
        if (!isnumber(this.value))
           return 1;
        if (this.value.length() != 9)
            return 2;
        if ((this.value.charAt(0)=='0') && (this.value.charAt(1)=='0'))
            return 3;
        return 0;
    }


}
