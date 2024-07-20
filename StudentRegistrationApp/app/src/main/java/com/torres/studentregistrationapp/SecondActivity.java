package com.torres.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textOutput = findViewById(R.id.textView_name);
        textOutput.setText(getIntent().getExtras().getString("nameKey"));

        textOutput = findViewById(R.id.textView_program);
        textOutput.setText(getIntent().getExtras().getString("programKey"));

        textOutput = findViewById(R.id.textView_course1);
        textOutput.setText(getIntent().getExtras().getString("course1Key"));

        textOutput = findViewById(R.id.textView_course2);
        textOutput.setText(getIntent().getExtras().getString("course2Key"));

        textOutput = findViewById(R.id.textView_course3);
        textOutput.setText(getIntent().getExtras().getString("course3Key"));
    }
}
