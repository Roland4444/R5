package Essentials.Implementations;

import Essentials.Specifications.requisites;

public class typePayment extends requisites {
    public typePayment(String value){
        this.value = value;
    }

    @Override
    public int control() {
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 2)
            return 2;
        return 0;
    }
}
