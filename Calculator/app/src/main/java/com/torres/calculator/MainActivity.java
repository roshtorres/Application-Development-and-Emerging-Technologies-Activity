package com.torres.calculator;

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

    public void Add(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.inputNumber1);
        EditText num2 = (EditText)findViewById(R.id.inputNumber2);
        EditText opt = (EditText)findViewById(R.id.output);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 + n2;

        opt.setText("The sum is " + res + ".");
    }

    public void Subtract(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.inputNumber1);
        EditText num2 = (EditText)findViewById(R.id.inputNumber2);
        EditText opt = (EditText)findViewById(R.id.output);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 - n2;

        opt.setText("The difference is " + res + ".");
    }

    public void Multiply(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.inputNumber1);
        EditText num2 = (EditText)findViewById(R.id.inputNumber2);
        EditText opt = (EditText)findViewById(R.id.output);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 * n2;

        opt.setText("The product is " + res + ".");
    }

    public void Divide(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.inputNumber1);
        EditText num2 = (EditText)findViewById(R.id.inputNumber2);
        EditText opt = (EditText)findViewById(R.id.output);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 / n2;

        opt.setText("The quotient is " + res + ".");
    }

    public void Clear(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.inputNumber1);
        EditText num2 = (EditText)findViewById(R.id.inputNumber2);
        EditText opt = (EditText)findViewById(R.id.output);

        num1.setText("");
        num2.setText("");
        opt.setText("");
    }

}