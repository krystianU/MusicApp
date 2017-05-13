package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView home = (ImageView) findViewById(R.id.home_image_view);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView library = (ImageView) findViewById(R.id.library_image_view);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(NowPlayingActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        ImageView search = (ImageView) findViewById(R.id.search_image_view);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
