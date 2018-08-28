package Essentials.Implementations;

import Essentials.Implementations.reqs.*;

public class BankReqs {
    public BankReqs(){
        this.namebank=new NameBank();
        this.corr_accnumber=new accNumber();
        this.bik=new bik();
        this.addressbank=new addressBank();
        this.accNumber=new accNumber();
        this.swiftcode=new swiftcode();
    }
    public NameBank namebank;
    public addressBank addressbank;
    public accNumber accNumber;
    public Essentials.Implementations.reqs.bik bik;
    public Essentials.Implementations.reqs.swiftcode swiftcode;
    public accNumber corr_accnumber;
}
