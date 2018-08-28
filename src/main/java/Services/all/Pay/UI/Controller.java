package Services.all.Pay.UI;

import Essentials.Implementations.BankReqs;
import Essentials.Implementations.Beneficiar;
import Essentials.Implementations.Payer;
import Essentials.Implementations.reqs.*;
import Essentials.Implementations.summTransaction;
import Services.all.Pay.PaymentModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import utils.Freezer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;


public class Controller    {
    BankReqs br = new BankReqs();
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
    private TextField accnumber_payer;
    @FXML
    private TextField bank_payer;
    @FXML
    private TextField accnumber_beneficiary;

    @FXML
    private TextField bank_beneficiary;

    @FXML
    private TextField bank_adress_beneficiary;

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
    private TextField bank_corrnumber_payer;

    @FXML
    private TextField oktmo;
    @FXML
    private TextField OP;
    @FXML
    private TextField tax_period;
    @FXML
    private DatePicker time_pay;
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
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(new Stage());

        if(file != null){
            linkModel();
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
    }

    public int linkModel(){
        pm.status=false;
        if (status.getText().length()>1)
            pm.status=true;

        pm.beneficiar= new Beneficiar();
        pm.beneficiar.Name=name_beneficiary.getText();


        br.addressbank.value = bank_adress_beneficiary.getText();
        if (br.addressbank.control() !=0){
            return 1;
        }

        br.accNumber.value=accnumber_beneficiary.getText();
        br.addressbank.value=bank_adress_beneficiary.getText();
        br.bik.value=bank_bik_beneficiary.getText();
        br.corr_accnumber.value=bank_corrnumber_beneficiary.getText();
        br.namebank.value = bank_name_beneficiary.getText();
        pm.beneficiar.bankReqs.add(br);

        br.accNumber.value=accnumber_payer.getText();
        br.addressbank.value=bank_adress_payer.getText();
        br.bik.value=bank_bik_payer.getText();
        br.corr_accnumber.value=bank_corrnumber_payer.getText();
        br.namebank.value = bank_name_payer.getText();
        pm.payer.bankReqs.add(br);

        pm.summ=new summTransaction();
        pm.summ.rubles=Integer.parseInt(summ.getText());

       



        return 0;


    }
}
