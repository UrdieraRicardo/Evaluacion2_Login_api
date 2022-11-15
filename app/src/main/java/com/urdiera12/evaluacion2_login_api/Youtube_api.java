package com.urdiera12.evaluacion2_login_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Youtube_api extends YouTubeBaseActivity {

    //iniciar variables
    YouTubePlayerView youTubePlayerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_api);


        //asignar variables
        youTubePlayerView = findViewById(R.id.youtube_player_view);

        //inicializar listener
        YouTubePlayer.OnInitializedListener Listener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //Cargar video usando youtube
                youTubePlayer.loadVideo("u0hxjdWG84k");
                //iniciar video
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(),
                        "No se pudo iniciar",
                        Toast.LENGTH_SHORT).show();
            }

        };
        //iniciar reproduccion
        youTubePlayerView.initialize("AIzaSyAm2Uc5UGfiXRo7OorB6mYDeVZ5K_smOaI", Listener);
    }
}