package com.example.demo.DesignTheUserInterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefaultWindow  {
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        Button button = new Button();
        button.setText("Hello there stevo");

        vBox.getChildren().add(button);

        //vBox.getChildren().add(vBox);

        Scene scene = new Scene(vBox,500,800);

        stage.setTitle("User UI");

        stage.setScene(scene);

        stage.show();
    }
}
