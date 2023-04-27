module com.personal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.personal to javafx.fxml;
    exports com.personal;
}
