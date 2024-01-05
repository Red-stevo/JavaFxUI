module com.redstevo.ui.jxfxui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.redstevo.ui.jxfxui to javafx.fxml;
    exports com.redstevo.ui.jxfxui;
}