package Essentials.Implementations;

import Essentials.Specifications.requisites;

public class targetPayment  extends requisites {

    @Override
    public int control() {
        if (this.value.length()>210)
            return 1;
        return 0;
    }
}
