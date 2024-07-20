package com.torres.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void Calculate(View v)
    {
        EditText weight = (EditText)findViewById(R.id.weightText);
        EditText height = (EditText)findViewById(R.id.heightText);
        EditText res = (EditText)findViewById(R.id.result);

        double w = Double.parseDouble(weight.getText().toString());
        double h = Double.parseDouble(height.getText().toString());
        double output = w / (h * h);

        if(output < 18.5)
        {
            res.setText(output +
                        "\nUnderweight");
        }
        else if (output >= 18.5 && output < 25)
        {
            res.setText(output +
                        "\nHealthy Weight");
        }
        else if (output >= 25 && output < 30)
        {
            res.setText(output +
                        "\nOverweight");
        }
        else if (output >= 30)
        {
            res.setText(output +
                        "\nObese");
        }
        else
        {
            res.setText("Error");
        }
    }

}