package Essentials.Implementations;

import Essentials.Specifications.inn;

public class inn_p  extends inn {
    public inn_p(String value_) {
        value = value_;

    }

    public boolean control() {

        if (this.value.length() != 12)
            return false;
        if ((this.value.charAt(0) == '0') && (this.value.charAt(1) == '0'))
            return false;
        return true;
    }

}