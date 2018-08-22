package Essentials.Implementations.withStatus;

import Essentials.Specifications.requisitesWStatus;

import java.util.HashMap;
import java.util.Map;

public class taxFrame extends requisitesWStatus {
    public String abr_period;
    public String period;
    taxFrame (String value, boolean status){
        this.value=value;
        this.status=status;
    }

    @Override
    public int control() {
        Map<String, Integer> dict = new HashMap<>();
        Map<String, Integer> monthDict = new HashMap<>();
        Map<String, Integer> Dictйк = new HashMap<>();

        dict.put("МС", 1);
        dict.put("КВ", 2);
        dict.put("ПЛ", 3);
        dict.put("ГД", 4);
        if (!this.status)
            return 0;
        abr_period = this.value.substring(0, 2);
        if (dict.get(abr_period) == null)
            return 1;
        int cop = dict.get(abr_period);
        switch (cop){
            case 1:

            case 2:

            case 3:

            case 4:


        }
        period = this.value.substring(3, 5);

        return 0;
    }
}
