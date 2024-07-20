package com.torres.intentlesson;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button;
    EditText myText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        myText = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent myIntent= new Intent(MainActivity.this, SecondScreen.class);
        myIntent.putExtra("myKey", myText.getText().toString());
        startActivity(myIntent);
    }

}