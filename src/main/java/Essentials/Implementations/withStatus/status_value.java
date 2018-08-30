package Essentials.Implementations.withStatus;

import Essentials.Specifications.reqs.requisites;

public class status_value extends requisites {
    public int setValue(String input){
        this.value = input;
        return control();
    }
    @Override
    public int control() {
        if (this.value.length()!=0)
            return 0;
        return 1;
    }
}
