package com.torres.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button;
    EditText nameText, programText, course1Text, course2Text, course3Text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        nameText = findViewById(R.id.editTextTextName);
        programText = findViewById(R.id.editTextTextProgram);
        course1Text = findViewById(R.id.editTextTextCourse1);
        course2Text = findViewById(R.id.editTextTextCourse2);
        course3Text = findViewById(R.id.editTextTextCourse3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent myIntent= new Intent(MainActivity.this, SecondActivity.class);
        myIntent.putExtra("nameKey", nameText.getText().toString());
        myIntent.putExtra("programKey", programText.getText().toString());
        myIntent.putExtra("course1Key", course1Text.getText().toString());
        myIntent.putExtra("course2Key", course2Text.getText().toString());
        myIntent.putExtra("course3Key", course3Text.getText().toString());
        startActivity(myIntent);
    }
}