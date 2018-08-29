package Essentials.Specifications;

import Essentials.Implementations.BankReqs;
import Essentials.Implementations.reqs.kpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public abstract class Actor implements Serializable {

    public String Name;
    public inn inn;
    public kpp kpp;
    public ArrayList<BankReqs> bankReqs;

    public void setDict(Map<Character, Integer> dict){


        for (int i =0; i<this.bankReqs.size();i++){
            this.bankReqs.get(i).swiftcode.dictionary=dict;
            this.bankReqs.get(i).accNumber.dictionary=dict;
            this.bankReqs.get(i).addressbank.dictionary=dict;
            this.bankReqs.get(i).bik.dictionary=dict;
            this.bankReqs.get(i).corr_accnumber.dictionary=dict;
            this.bankReqs.get(i).namebank.dictionary=dict;
        }
        this.inn.dictionary=dict;
        this.kpp.dictionary=dict;
    }
}
