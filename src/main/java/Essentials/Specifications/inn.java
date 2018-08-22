package Essentials.Specifications;

import java.util.HashMap;
import java.util.Map;

public abstract class inn  extends requisites{
    public String value=null;
    public Map<String, Boolean> dictionary=new HashMap();
    public abstract boolean control();


}
