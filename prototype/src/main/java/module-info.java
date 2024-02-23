module org.acme.prototype {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.acme.prototype to javafx.fxml;
    opens org.acme.prototype.model to javafx.base;
    exports org.acme.prototype;
}
