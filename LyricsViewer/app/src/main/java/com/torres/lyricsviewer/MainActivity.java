package com.torres.lyricsviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btn_song1;
    Button btn_song2;
    Button btn_song3;
    Button btn_song4;
    Button btn_song5;
    Button btn_song6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_song1 = findViewById(R.id.btn_song1);
        btn_song1.setOnClickListener(this);

        btn_song2 = findViewById(R.id.btn_song2);
        btn_song2.setOnClickListener(this);

        btn_song3 = findViewById(R.id.btn_song3);
        btn_song3.setOnClickListener(this);

        btn_song4 = findViewById(R.id.btn_song4);
        btn_song4.setOnClickListener(this);

        btn_song5 = findViewById(R.id.btn_song5);
        btn_song5.setOnClickListener(this);

        btn_song6 = findViewById(R.id.btn_song6);
        btn_song6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent myIntent;

        if (v == btn_song1)
        {
            myIntent = new Intent(MainActivity.this, Song1.class);
            startActivity(myIntent);
        }
        else if (v == btn_song2)
        {
            myIntent = new Intent(MainActivity.this, Song2.class);
            startActivity(myIntent);
        }
        else if (v == btn_song3)
        {
            myIntent = new Intent(MainActivity.this, Song3.class);
            startActivity(myIntent);
        }
        else if (v == btn_song4)
        {
            myIntent = new Intent(MainActivity.this, Song4.class);
            startActivity(myIntent);
        }
        else if (v == btn_song5)
        {
            myIntent = new Intent(MainActivity.this, Song5.class);
            startActivity(myIntent);
        }
        else if (v == btn_song6)
        {
            myIntent = new Intent(MainActivity.this, Song6.class);
            startActivity(myIntent);
        }
    }

}