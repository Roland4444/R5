package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

public class op extends requisitesWStatus {
    public op(String value, boolean status){
        this.value=value;
        this.status=status;
    }

    @Override
    public int control(){
        if (!this.status)
            return 0;
        if (this.value.length() != 2)
            return 2;
        return 0;
    }
}
