module org.acme.prototype {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.acme.prototype to javafx.fxml;
    exports org.acme.prototype;
}
