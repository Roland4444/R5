package Services.all.Pay;

import Essentials.Implementations.*;
import Essentials.Implementations.reqs.seqPayment;
import Models.Specification.model;

public class PaymentModel extends model {
    public boolean status;
    public Payer payer;
    public Beneficiar beneficiar;
    public summTransaction summ;
    public Essentials.Implementations.reqs.typePayment typePayment;
    public seqPayment seqPayments;
    public reserved reserved;
}
