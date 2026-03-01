package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private Button button;
    private Button button5;
    private Button button6;
    private Button button7;
    private EditText number1;
    private EditText number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

    }
    public void addition(View view){
        String s = number1.getText().toString();
        String s2 = number2.getText().toString();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s2);
        float c = a+b;
        textView2.setText("Addition of "+a+" And "+b+ " is :" +c);
    }

    public void subtraction(View view){
        String s = number1.getText().toString();
        String s2 = number2.getText().toString();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s2);
        float c = a - b;
        textView2.setText("Subtraction of "+a+" And "+b+ " is :" +c);
    }
    public void multi(View view){
        String s = number1.getText().toString();
        String s2 = number2.getText().toString();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s2);
        float c = a*b;
        textView2.setText("Multiplication of "+a+" And "+b+ " is :" +c);
    }
    public void divi(View view){
        String s = number1.getText().toString();
        String s2 = number2.getText().toString();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s2);
        float c = a / b;
        textView2.setText("Division of "+a+" And "+b+ " is :" +c);
    }
    }
