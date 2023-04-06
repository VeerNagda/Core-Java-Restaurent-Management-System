module com.corejava.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.corejava.project to javafx.fxml;
    exports com.corejava.project;
}