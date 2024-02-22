module org.acme.turbospeed {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.acme.turbospeed to javafx.fxml;
    exports org.acme.turbospeed;
}
