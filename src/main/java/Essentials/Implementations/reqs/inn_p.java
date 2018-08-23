package Essentials.Implementations.reqs;

import Essentials.Specifications.inn;

public class inn_p  extends inn {
    public inn_p(String value_) {
        value = value_;

    }

    public int control() {
        if (this.value.length() != 12)
            return 1;
        if ((this.value.charAt(0) == '0') && (this.value.charAt(1) == '0'))
            return 2;
        return 0;
    }

}