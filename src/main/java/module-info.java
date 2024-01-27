module org.simplebuttoncounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.simplebuttoncounter to javafx.fxml;
    exports org.simplebuttoncounter;
}