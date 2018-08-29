package Services.all.Pay;

import Essentials.Dictionary.Dictionary4Requisites;
import Essentials.Implementations.*;
import Essentials.Implementations.reqs.seqPayment;
import Essentials.Implementations.reqs.typePayment;
import Models.Specification.model;

import java.io.Serializable;

public class PaymentModel extends model implements Serializable {
    Dictionary4Requisites dicts;
    public PaymentModel(Dictionary4Requisites dicts){
        this.dicts=dicts;
        this.beneficiar=new Beneficiar();
        this.payer=new Payer();
        this.status=false;
        this.summ=new summTransaction();
        this.seqPayments=new seqPayment();
        this.typePayment=new typePayment();
    }
    public PaymentModel(){
        this.beneficiar=new Beneficiar();
        this.payer=new Payer();
        this.status=false;
        this.summ=new summTransaction();
        this.seqPayments=new seqPayment();
        this.typePayment=new typePayment();
    }
    public boolean status;
    public Payer payer;
    public Beneficiar beneficiar;
    public summTransaction summ;
    public typePayment typePayment;
    public seqPayment seqPayments;
    public reserved reserved;
    public ReqsWithStatus reqs_wstatus;
    public String comment;
}
