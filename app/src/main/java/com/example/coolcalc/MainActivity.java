package com.example.coolcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int n;
    char op;
    int result;
    EditText display;
    Button plus, minus, multiply, divide, clear, equal, credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (EditText) findViewById(R.id.et);
        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        multiply = findViewById(R.id.button3);
        divide = findViewById(R.id.button4);
        clear = findViewById(R.id.button5);
        equal = findViewById(R.id.button6);
        credits = findViewById(R.id.button7);
    }
    public int firstNum(){
        int num = Integer.parseInt(display.getText().toString());
        display.getText().clear();
        return num;
    }
    public int secondNum(){
        return Integer.parseInt(display.getText().toString());
    }
    public int calcres(int num1, int num2, char operator){
        int res = 0;
        switch (operator){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1/num2;
                break;
        }
        return res;
    }

    public void go(View view) {
        n = firstNum();
        op = '+';
    }
    public void go1(View view) {
        n = firstNum();
        op = '-';
    }
    public void go2(View view) {
        n = firstNum();
        op = '*';
    }

    public void go3(View view) {
        n = firstNum();
        op = '/';
    }

    public void go4(View view) {
        display.getText().clear();
    }

    public void go5(View view) {
        result = calcres(n, secondNum(), op);
        display.setText(String.valueOf(result));
    }

    public void go6(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("lastRes", result);
        startActivity(si);
    }
}