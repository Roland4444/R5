package Essentials.Implementations.withStatus;

import Essentials.Specifications.reqs.requisitesWStatus;

public class op extends requisitesWStatus {
    public op(){
        this.status=true;
    }
    public op (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    public op(boolean status, boolean isNull){
        this.value="0";
        this.isNull=isNull;
        this.status=status;
    }

    @Override
    public int control(){
        if (!this.status)
            return 0;
        if (this.value.equals("0"))
            return 0;
        if (isNull){
            this.value="0";
            return 0;
        }
        if (this.value.length() != 2)
            return 2;
        return 0;
    }
}
