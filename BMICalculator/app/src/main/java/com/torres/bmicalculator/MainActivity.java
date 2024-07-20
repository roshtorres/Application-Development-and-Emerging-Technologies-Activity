package com.torres.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View v)
    {
        EditText weight = (EditText)findViewById(R.id.editText_Weight);
        EditText height = (EditText)findViewById(R.id.editText_Height);
        EditText result1 = (EditText)findViewById(R.id.editText_Result1);
        EditText result2 = (EditText)findViewById(R.id.editText_Result2);

        double w = Double.parseDouble(weight.getText().toString());
        double h = Double.parseDouble(height.getText().toString());
        double r = w / (h * h);

        result1.setText(String.format("Your BMI is %.2f", r));

        if(r < 18.5)
        {
            result2.setText("Category: Underweight");
        }
        else if (r >= 18.5 && r < 25)
        {
            result2.setText("Category: Healthy Weight");
        }
        else if (r >= 25 && r < 30)
        {
            result2.setText("Category: Overweight");
        }
        else if (r >= 30)
        {
            result2.setText("Category: Obese");
        }
        else
        {
            result1.setText("Error");
        }
    }

    public void Clear(View v)
    {
        EditText weight = (EditText)findViewById(R.id.editText_Weight);
        EditText height = (EditText)findViewById(R.id.editText_Height);
        EditText result1 = (EditText)findViewById(R.id.editText_Result1);
        EditText result2 = (EditText)findViewById(R.id.editText_Result2);

        weight.setText("");
        height.setText("");
        result1.setText("");
        result2.setText("");
    }
}