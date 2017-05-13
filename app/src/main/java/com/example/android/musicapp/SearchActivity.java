package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView home = (ImageView) findViewById(R.id.home_image_view);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        ImageView nowPlaying = (ImageView) findViewById(R.id.now_playing_image_view);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        ImageView library = (ImageView) findViewById(R.id.library_image_view);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
    }

