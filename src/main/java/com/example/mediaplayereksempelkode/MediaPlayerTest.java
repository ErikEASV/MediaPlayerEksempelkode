package com.example.mediaplayereksempelkode;

// Eksempel på enkel brug af MediaPlayer / Ek dec. 2022
// *****NB*****
// Media-biblioteket skal først installeres:
// 1. Vælg: File -> Project structure... -> Modules -> depencies -> + -> Library -> From Maven...
// 2. Indtast: "org.openjfx" og tryk på søg
// 3. Find i listen "org.openjfx:javafx-media:18.0.1" eller med det versionsnr der passer din jdk.
// Vælg OK. Nu er javafx.media installeret.
// 4. Find filen "module-info.java" under src/main/java i dit projekt
// Tilføj linjen: "requires javafx.media" efter de andre linjer med "requires".
// Nu kan du gå din kode igennem og få den til at importere de nødvendige biblioteker.
// De lydfiler du ønsker at afspille skal som udgangspunkt ligge i "resources", dvs samme sted som fxml-filen ligger.
// Før nedenstående virker skal du finde en lydfil og rette filnavnet i HelloController:-)
//

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MediaPlayerTest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MediaPlayerTest.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MediaPlayer e");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}