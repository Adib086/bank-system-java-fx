package com.example.ahhar.Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Text user_name;
    public Label login_date;

    public Label checking_acc_num;

    public Label checking_acc;
    public Label checking_bal;
    public Label income_bal;
    public Label expense_bal;
    public ListView transaction_listview;
    public TextField account_fld;
    public TextField amount_fld;
    public TextArea msg_fld;
    public Button send_money_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
