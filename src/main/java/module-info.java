module com.example.ejemplojfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens view to javafx.fxml;
    opens controlerView to javafx.fxml;
    opens model to com.google.gson;

    exports view;
    exports controlerView;
}