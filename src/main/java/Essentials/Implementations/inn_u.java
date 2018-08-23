
package Essentials.Implementations;

import Essentials.Specifications.inn;


public class inn_u extends inn  {
    public boolean isForeign=false;
    public inn_u(String value_){
        value = value_;
        this.isForeign=false;
    }

    public inn_u(String value_, boolean foreign){
        value = value_;
        this.isForeign=foreign;
    }

    public int control(){
       if (!isnumber(this.value))
           return 1;

        if (!this.isForeign){
            if (this.value.length() != 10)
                return 2;

            if ((this.value.charAt(0)=='0') && (this.value.charAt(1)=='0'))
                return 3;
            return 0;
        }
        if (this.value.length() != 5)
            return 4;
        if (this.value.equals("00000"))
            return 5;
        return 0;
    }



}
