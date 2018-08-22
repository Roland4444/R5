package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

public class oktmo extends requisitesWStatus {
    public oktmo(String value, boolean status){
        this.value=value;
        this.status=status;
    }

    @Override
    public int control(){
        if (!this.status)
            return 0;
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 20)
            return 2;
        return 0;
    }
}
