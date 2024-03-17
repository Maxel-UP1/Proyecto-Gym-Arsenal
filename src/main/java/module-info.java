module com.example.ejemplojfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens view to javafx.fxml;
    exports view;
    exports controlerView;
    opens controlerView to javafx.fxml;
}