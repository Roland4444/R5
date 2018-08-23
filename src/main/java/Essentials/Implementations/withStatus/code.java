package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

public class code extends requisitesWStatus {
    public code (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    public code(boolean status, boolean isNull){
        this.value="0";
        this.isNull=isNull;
        this.status=status;
    }
    @Override
    public int control() {
        if (!this.status)
            return 0;
        if (isNull){
            this.value="0";
            return 0;
        }
        if (!isnumber(this.value))
            return 1;
        if (this.value.length() != 20)
            return 4;
        return 0;
    }
}
