package com.example.ahhar;

import com.example.ahhar.Models.Model;
import com.example.ahhar.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

   @Override
    public void start(Stage stage) {

        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
