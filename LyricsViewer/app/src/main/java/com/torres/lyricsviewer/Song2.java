package com.torres.lyricsviewer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Song2 extends AppCompatActivity implements View.OnClickListener
{
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song2);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent myIntent = new Intent(Song2.this, MainActivity.class);
        startActivity(myIntent);
    }
}
