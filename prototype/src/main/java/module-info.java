module org.acme.prototype {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

    opens org.acme.prototype.controller to javafx.fxml;
    opens org.acme.prototype.model to javafx.base;
    exports org.acme.prototype.controller;
}
