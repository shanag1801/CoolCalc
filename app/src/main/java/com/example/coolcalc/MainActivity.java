package com.example.coolcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button plus, minus, multiply, divide, clear, equal, credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.et);
        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        multiply = findViewById(R.id.button3);
        divide = findViewById(R.id.button4);
        clear = findViewById(R.id.button5);
        equal = findViewById(R.id.button6);
        credits = findViewById(R.id.button7);
    }

    public void go1(View view) {
    }

    public void go3(View view) {
    }

    public void go2(View view) {
    }

    public void go(View view) {
    }

    public void go4(View view) {
    }

    public void go5(View view) {
    }
}