package Essentials.Implementations.withStatus;

import Essentials.Specifications.reqs.requisitesWStatus;

import java.util.Map;

public class taxFrame extends requisitesWStatus {
    public taxFrame(){
        this.status=true;
    }
    public Map<Character, Integer> dictNumbers ;
    public Map<String, Integer> dictTaxes;
    public Map<String, Integer> monthDictTaxes;
    public Map<String, Integer> qrDictTaxes;
    public Map<String, Integer> halfDictTaxes;
    public String abr_period;
    public String period;
    public taxFrame (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    public taxFrame(boolean status, boolean isNull){
        this.value="0";
        this.isNull=isNull;
        this.status=status;
    }

    @Override
    public int control() {
        if (!this.status)
            return 0;
        if (this.value.equals("0"))
            return 0;
        if (isNull){
            this.value="0";
            return 0;
        }
        if (this.value.length()!=10)
            return 9;
        abr_period = this.value.substring(0, 2);
        period = this.value.substring(3, 5);
        if (dictTaxes.get(abr_period) == null)
            return 1;
        int cop = dictTaxes.get(abr_period);

        switch (cop){
            case 1: {
                if (monthDictTaxes.get(period) == null)
                    return 2;
                break;
            }

            case 2: {
                if (qrDictTaxes.get(period) == null)
                    return 3;
                break;
            }

            case 3: {
                if (halfDictTaxes.get(period) == null)
                    return 4;
                break;
            }

            case 4: {
                if (!period.equals("00"))
                    return 5;
                break;
            }
        }

        if ((this.value.charAt(2) != '.') || (this.value.charAt(5) != '.'))
            return 6;


        return 0;
    }
}
