package com.example.mediaplayereksempelkode;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HelloController {
    @FXML
    private Label welcomeText;

    // Bemærk at ét mediaplayer objekt sættes op her, så objektet ikke bliver fjernet af garbage collectoren...
    // og at vi hele tiden bruger det samme objekt til afspilning.
    private static MediaPlayer mediaPlayer;

    @FXML
    protected void afspilknapKlik() {
        try {
            Media lyd = new Media(String.valueOf(getClass().getResource("sample-3s.mp3")));
            mediaPlayer = new MediaPlayer(lyd);
            mediaPlayer.seek(mediaPlayer.getStartTime());
            mediaPlayer.play();

            welcomeText.setText("Afspiller nu :" + mediaPlayer.getMedia().getSource().toString());
        } catch (Exception e) {
                    System.out.println("Fejl: " + e.getMessage());
        }
    }
}