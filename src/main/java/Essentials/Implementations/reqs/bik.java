package Essentials.Implementations.reqs;

import Essentials.Specifications.reqs.requisites;

public class bik extends requisites {
    public int control(){
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 9)
            return 2;
        return 0;
    }
}
