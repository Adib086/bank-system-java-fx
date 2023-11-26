package com.example.ahhar.Controller;

import com.example.ahhar.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label acc_lbl;
    public TextField acc_num;
    public Label pass_lbl;
    public TextField pass_fld;
    public Button login_btn;
    public Label eroor_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            login_btn.setOnAction(actionEvent -> onLogin());
    }

    public void onLogin(){
        Stage stage=(Stage) eroor_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
