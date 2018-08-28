package Essentials.Specifications;

import Essentials.Implementations.BankReqs;
import Essentials.Implementations.reqs.kpp;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Actor implements Serializable {
    public String Name;
    public inn inn;
    public kpp kpp;
    public ArrayList<BankReqs> bankReqs;

}
