package Services.all.Pay;

import Essentials.Dictionary.Dictionary4Requisites;
import Essentials.Implementations.withStatus.*;

public class ReqsWithStatus {
    Dictionary4Requisites dict = new Dictionary4Requisites();
    public ReqsWithStatus(){
        this.code = new code();
        this.dateTaxDoc=new dateTaxDoc();
        this.kbk=new kbk();
        this.numberTaxDoc= new numberTaxDoc();
        this.oktmo = new oktmo();
        this.op = new op();

        this.taxFrame=new taxFrame();
        this.taxFrame.qrDictTaxes=dict.qrDictTaxes;
        this.taxFrame.monthDictTaxes=dict.monthDictTaxes;
        this.taxFrame.halfDictTaxes=dict.halfDictTaxes;
        this.taxFrame.dictTaxes = dict.dictTaxes;
        this.taxFrame.dictNumbers=dict.dictNumbers;
    }
    public code code;
    public dateTaxDoc  dateTaxDoc;
    public kbk kbk;
    public numberTaxDoc  numberTaxDoc;
    public oktmo oktmo;
    public op op;
    public taxFrame taxFrame;
}
