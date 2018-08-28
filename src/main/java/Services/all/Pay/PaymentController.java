package Services.all.Pay;

import Models.Specification.model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;


public class PaymentController extends Controllers.controller {

    public PaymentController(PaymentModel m){
        this.model =  m;
    }

    public void savemodel(){

    }

    public byte[] savemodel_(){
        return null;
    }

    public Models.Specification.model loadmodel(){
        return null;
    }

    @FXML
    private Text actiontarget;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("bugaga");
    }
}
