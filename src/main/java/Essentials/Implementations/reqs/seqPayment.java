package Essentials.Implementations.reqs;

import Essentials.Specifications.reqs.requisites;

public class seqPayment  extends requisites {
    public seqPayment(String value) {
        this.value = value;
    }

    @Override
    public int control() {
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 1)
            return 2;
        return 0;
    }
}
