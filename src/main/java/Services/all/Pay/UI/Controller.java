package Services.all.Pay.UI;

import Essentials.Dictionary.Dictionary4Requisites;
import Essentials.Dictionary.DictionaryErrors;
import Essentials.Implementations.BankReqs;
import Essentials.Implementations.Beneficiar;
import Essentials.Implementations.reqs.*;
import Essentials.Implementations.summTransaction;
import Services.all.Pay.PaymentModel;
import Services.all.Pay.ReqsWithStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import utils.Freezer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Controller    {
    boolean initalready=false;
    DictionaryErrors dicTErrors=new DictionaryErrors();;
    Dictionary4Requisites dictReqs = new Dictionary4Requisites();
    public void initDictErrors(){
    }
    BankReqs br1 = new BankReqs();
    BankReqs br2 = new BankReqs();
    PaymentModel pm = new PaymentModel();
    Freezer fr = new Freezer();
    @FXML
    private Text actiontarget;
    @FXML
    private TextField name_payer;
    @FXML
    private TextField inn_payer;
    @FXML
    private TextField kpp_payer;
    @FXML
    private TextField number_acc_payer;
    @FXML
    private TextField bank_name_payer;
    @FXML
    private TextField bank_adress_payer;
    @FXML
    private TextField bank_bik_payer;
    @FXML
    private TextField bank_corr_payer;
    @FXML
    private TextField name_beneficiary;
    @FXML
    private TextField inn_beneficiary;
    @FXML
    private TextField kpp_beneficiary;
    @FXML
    private TextField accnumber_beneficiary;
    @FXML
    private TextField bank_adress_beneficiary;
    @FXML
    private TextField comment;
    @FXML
    private TextField bank_bik_beneficiary;
    @FXML
    private TextField bank_corrnumber_beneficiary;
    @FXML
    private TextField bank_name_beneficiary;
    @FXML
    private TextField bank_kbk_beneficiar;
    @FXML
    private TextField summ;
    @FXML
    private TextField status;
    @FXML
    private TextField oktmo;
    @FXML
    private TextField OP;
    @FXML
    private TextField tax_period;
    @FXML
    private TextField time_pay;
    @FXML
    private	ComboBox seq_pay;
    @FXML
    private Label chf;

    protected void handleSubmitButtonAction(ActionEvent event) {
        alert();
    }

    public void alarm(ActionEvent actionEvent) {
        alert();
    }

    public  void alert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("An exception occurred!");
        alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea()));
        alert.showAndWait();

    }

    public void chageText(){
        chf.setText("55555555");
    }

    public void SaveModel(ActionEvent actionEvent) throws IOException {
        if (linkModel() != 0) {
            error("исправьте ошибки!");
            return;
        }
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(new Stage());
        if(file != null){
            FileOutputStream fos = new FileOutputStream(file.toString());
            fos.write(fr.saveModel(pm));
            fos.close();
        }
    }

    public void LoadModel(ActionEvent actionEvent) throws IOException {
        System.out.println("there");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            PaymentModel pm2 = fr.restoreModel(Files.readAllBytes(file.toPath()));
            loadM(pm2);
        }
    }

    public void loadM(PaymentModel pm){
        System.out.println(pm.beneficiar.Name);
        name_beneficiary.setText(pm.beneficiar.Name);
        accnumber_beneficiary.setText(pm.beneficiar.bankReqs.get(0).accNumber.value);
        bank_bik_beneficiary.setText(pm.beneficiar.bankReqs.get(0).bik.value);
        bank_corrnumber_beneficiary.setText(pm.beneficiar.bankReqs.get(0).corr_accnumber.value);
        bank_name_beneficiary.setText(pm.beneficiar.bankReqs.get(0).namebank.value);
        bank_adress_beneficiary.setText(pm.beneficiar.bankReqs.get(0).addressbank.value);
        inn_beneficiary.setText(pm.beneficiar.inn.value);
        kpp_beneficiary.setText(pm.beneficiar.kpp.value);

        name_payer.setText(pm.payer.Name);
        number_acc_payer.setText(pm.payer.bankReqs.get(0).accNumber.value);
        bank_bik_payer.setText(pm.payer.bankReqs.get(0).bik.value);
        bank_corr_payer.setText(pm.payer.bankReqs.get(0).corr_accnumber.value);
        bank_name_payer.setText(pm.payer.bankReqs.get(0).namebank.value);
        bank_adress_payer.setText(pm.payer.bankReqs.get(0).addressbank.value);
        inn_payer.setText(pm.payer.inn.value);
        kpp_payer.setText(pm.payer.kpp.value);
        comment.setText(pm.comment);

        summ.setText(pm.summ.rubles.toString());
        if (pm.status){
            status.setText(pm.reqs_wstatus.statusvalue.value);
            oktmo.setText(pm.reqs_wstatus.oktmo.value);
            bank_kbk_beneficiar.setText(pm.reqs_wstatus.kbk.value);
            OP.setText(pm.reqs_wstatus.op.value);
            tax_period.setText(pm.reqs_wstatus.taxFrame.value);
            time_pay.setText(pm.reqs_wstatus.dateTaxDoc.value);
        }


    }

    public void initmodel(){

        pm.beneficiar= new Beneficiar();

        pm.beneficiar.bankReqs=new ArrayList<BankReqs> ();

        br1.addressbank=new addressBank();
        br1.addressbank.dictionary=dictReqs.dictNumbers;

        br1.accNumber=new accNumber();
        br1.accNumber.dictionary=dictReqs.dictNumbers;

        br1.bik=new bik();
        br1.bik.dictionary=dictReqs.dictNumbers;

        br1.corr_accnumber=new accNumber();
        br1.corr_accnumber.dictionary=dictReqs.dictNumbers;

        br1.namebank=new NameBank();
        br1.namebank.dictionary=dictReqs.dictNumbers;

        pm.beneficiar.kpp=new kpp();
        pm.beneficiar.inn=new inn_u();

        pm.beneficiar.setDict(dictReqs.dictNumbers);

        pm.payer.bankReqs=new ArrayList<BankReqs> ();

        br2.addressbank=new addressBank();
        br2.addressbank.dictionary=dictReqs.dictNumbers;

        br2.accNumber=new accNumber();
        br2.accNumber.dictionary=dictReqs.dictNumbers;

        br2.bik=new bik();
        br2.bik.dictionary=dictReqs.dictNumbers;

        br2.corr_accnumber=new accNumber();
        br2.corr_accnumber.dictionary=dictReqs.dictNumbers;

        br2.namebank=new NameBank();
        br2.namebank.dictionary=dictReqs.dictNumbers;

        pm.payer.kpp=new kpp();
        pm.payer.inn=new inn_u();
        pm.payer.setDict(dictReqs.dictNumbers);

        pm.comment=comment.getText();

        initalready=true;

    }

    public Map<Integer, ReqsWithStatus> getReqsWS(){
        Map<Integer, ReqsWithStatus> result = new HashMap();
        ReqsWithStatus reqsws = new ReqsWithStatus();
        reqsws.taxFrame.dictTaxes = dictReqs.dictTaxes;
        reqsws.taxFrame.dictNumbers=dictReqs.dictNumbers;
        reqsws.taxFrame.halfDictTaxes=dictReqs.halfDictTaxes;
        reqsws.taxFrame.monthDictTaxes=dictReqs.monthDictTaxes;
        reqsws.taxFrame.qrDictTaxes=dictReqs.qrDictTaxes;
        if (reqsws.oktmo.setValue(oktmo.getText())!=0){
            error(dicTErrors.dict.get(200));
            result.put(20, reqsws);
            return result;
        }
        if (reqsws.kbk.setValue(bank_kbk_beneficiar.getText())!=0){
            error(dicTErrors.dict.get(201));
            result.put(21, reqsws);
            return result;
        }
        if (reqsws.op.setValue(OP.getText())!=0){
            error(dicTErrors.dict.get(202));
            result.put(22, reqsws);
            return result;
        }
        if (reqsws.taxFrame.setValue(tax_period.getText())!=0){
            error(dicTErrors.dict.get(203));
            result.put(23, reqsws);
            return result;
        }

        if ( time_pay.getText()==null){
            error(dicTErrors.dict.get(204));
            result.put(24, null);
            return result;
        }

        if (reqsws.dateTaxDoc.setValue(time_pay.getText().toString())!=0){
            System.out.println(reqsws.dateTaxDoc.setValue(time_pay.getText().toString()));
            error(dicTErrors.dict.get(207));
            result.put(24, reqsws);
            return result;
        }
        if (reqsws.statusvalue.setValue(status.getText())!=0){
            error(dicTErrors.dict.get(205));
            result.put(25, reqsws);
            return result;
        }

        result.put(0, reqsws);
        return result;

    }

    public int linkModel(){
        if (!initalready)
            initmodel();
        pm.status=false;
        if (status.getText().length()>1){
            normal("бюджетный платеж!");
            pm.status=true;
            pm.reqs_wstatus=new ReqsWithStatus();
            if (getReqsWS().get(0)!=null) {
                normal("данные бюджетного платежа корректны!");
                pm.reqs_wstatus = getReqsWS().get(0);
            }
            else return 555;
        }
        pm.beneficiar.Name=name_beneficiary.getText();
        if (br1.addressbank.setValue(bank_adress_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(1));
            return 1;
        }
        if (br1.accNumber.setValue(accnumber_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(2));
            return 2;
        }
        if (br1.bik.setValue(bank_bik_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(3));
            return 3;
        }
        if (br1.corr_accnumber.setValue(bank_corrnumber_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(4));
            return 4;
        }
        if (br1.namebank.setValue(bank_name_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(5));
            return 5;
        }
        if (pm.beneficiar.inn.setValue(inn_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(50));
            return 50;
        }
        if (pm.beneficiar.kpp.setValue(kpp_beneficiary.getText()) !=0){
            error(dicTErrors.dict.get(51));
            return 51;
        }
        pm.beneficiar.bankReqs.add(br1);
        if (br2.addressbank.setValue(bank_adress_payer.getText()) !=0){
            error(dicTErrors.dict.get(6));
            return 6;
        }
        if (br2.accNumber.setValue(number_acc_payer.getText()) !=0){
            error(dicTErrors.dict.get(7));
            return 7;
        }
        if (br2.bik.setValue(bank_bik_payer.getText()) !=0){
            error(dicTErrors.dict.get(8));
            return 8;
        }
        if (br2.corr_accnumber.setValue(bank_corr_payer.getText()) !=0){
            error(dicTErrors.dict.get(9));
            return 9;
        }
        if (br2.namebank.setValue(bank_name_payer.getText()) !=0){
            error(dicTErrors.dict.get(10));
            return 10;
        }
        if (pm.payer.inn.setValue(inn_payer.getText()) !=0){
            error(dicTErrors.dict.get(52));
            return 52;
        }
        if (pm.payer.kpp.setValue(kpp_payer.getText()) !=0){
            error(dicTErrors.dict.get(53));
            return 53;
        }
        pm.payer.Name=name_payer.getText();
        pm.payer.bankReqs.add(br2);
        pm.summ=new summTransaction();
        pm.summ.rubles=new BigDecimal(summ.getText());
        pm.seqPayments.value = seq_pay.getValue().toString();
        return 0;
    }

    private void normal(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(message);
        alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea()));
        alert.showAndWait();
    }

    private void error(String error_text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(error_text);
        alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea()));
        alert.showAndWait();
    }
}
