package Essentials.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary4Requisites {
    public Dictionary4Requisites(){
        dictNumbers= new HashMap<>();
        dictNumbers.put('0',0);
        dictNumbers.put('1',1);
        dictNumbers.put('2',2);
        dictNumbers.put('3',3);
        dictNumbers.put('4',4);
        dictNumbers.put('5',5);
        dictNumbers.put('6',6);
        dictNumbers.put('7',7);
        dictNumbers.put('8',8);
        dictNumbers.put('9',9);
        dictTaxes = new HashMap<>();
        dictTaxes.put("МС", 1);
        dictTaxes.put("КВ", 2);
        dictTaxes.put("ПЛ", 3);
        dictTaxes.put("ГД", 4);
        monthDictTaxes = new HashMap<>();
        monthDictTaxes.put("01",1);
        monthDictTaxes.put("02",2);
        monthDictTaxes.put("03",3);
        monthDictTaxes.put("04",4);
        monthDictTaxes.put("05",5);
        monthDictTaxes.put("06",6);
        monthDictTaxes.put("07",7);
        monthDictTaxes.put("08",8);
        monthDictTaxes.put("09",9);
        monthDictTaxes.put("10",10);
        monthDictTaxes.put("11",11);
        monthDictTaxes.put("12",12);
        qrDictTaxes = new HashMap<>();
        qrDictTaxes.put("01",1);
        qrDictTaxes.put("02",2);
        qrDictTaxes.put("03",3);
        qrDictTaxes.put("04",4);
        halfDictTaxes = new HashMap<>();
        halfDictTaxes.put("01",1);
        halfDictTaxes.put("02",2);
    }




    public Map<Character, Integer> dictNumbers ;
    public Map<String, Integer> dictTaxes;
    public Map<String, Integer> monthDictTaxes;
    public Map<String, Integer> qrDictTaxes;
    public Map<String, Integer> halfDictTaxes;
}
