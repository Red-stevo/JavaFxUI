package com.redstevo.ui.jxfxui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingWithLambdaNotations extends Application {

    VBox vBox;
    Button button;

    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        vBox = new VBox();
        label = new Label();
        button = new Button("Click Here.");
        label.setText("You clicked there....");

        vBox.getChildren().add(button);

        button.setOnAction(e -> {
            vBox.getChildren().add(label);
        });

        Scene scene = new Scene(vBox, 800, 600);

        stage.setTitle("Lambda Event Handling");
        stage.setScene(scene);
        stage.show();





    }
}
