package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageView home = (ImageView) findViewById(R.id.home_image_view);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        ImageView nowPlaying = (ImageView) findViewById(R.id.now_playing_image_view);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        ImageView search = (ImageView) findViewById(R.id.search_image_view);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(LibraryActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

    }

}