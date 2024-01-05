package com.redstevo.ui.jxfxui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MouseAction extends Application implements EventHandler<ActionEvent> {
    Label label;
     Button button;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();

       label= new Label();
       button = new Button();
       button.setOnAction(this);

       button.setText("Click Me");


       hBox.getChildren().addAll(label, button);

       Scene scene = new Scene(hBox, 700,500);

       stage.setTitle("Mouse Click Event");

       stage.setScene(scene);

       stage.show();


    }

    @Override
    public void handle(ActionEvent actionEvent) {
         if(actionEvent.getSource() == button)
         {
             label.setText("You clicked the button");
         }
    }
}




