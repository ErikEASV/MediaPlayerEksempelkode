module com.example.mediaplayereksempelkode {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.mediaplayereksempelkode to javafx.fxml;
    exports com.example.mediaplayereksempelkode;
}