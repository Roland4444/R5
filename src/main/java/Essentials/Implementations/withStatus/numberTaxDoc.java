package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

public class numberTaxDoc  extends requisitesWStatus {

    public numberTaxDoc (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    public numberTaxDoc(boolean status, boolean isNull){
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
        return 0;
    }
}
