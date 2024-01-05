package com.redstevo.ui.jxfxui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreatingMultipleScenes extends Application {

    Stage window;

    Scene scene1, scene2;

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        stage.setScene(createScene1());
        stage.setTitle("Multiple Scene Switching..>>");
        stage.show();

    }

    public Scene createScene1()
    {
        HBox hBox = new HBox();

        button = new Button("Move to scene 2-->>");
        Label label = new Label();
        label.setText("Welcome to scene one ....>>>>>");

        hBox .getChildren().addAll(label,button);
        button.setOnAction(e -> window.setScene(createScene2()));

        return new Scene(hBox, 800,500);
    }

    public Scene createScene2()
    {
        VBox vBox = new VBox();

        Label label = new Label();
        label.setText("Welcome to scene two....>>>");
        button = new Button("<<--Back");
        button.setOnAction(e -> window.setScene(createScene1()));

        vBox.getChildren().addAll(label,button);
        return new Scene(vBox, 800,500);
    }



}
