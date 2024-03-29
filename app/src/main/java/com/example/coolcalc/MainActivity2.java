package com.example.coolcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    Button btn;
    int lastRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.btn);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
            lastRes = extras.getInt("lastRes");
        tv.setText(String.valueOf(lastRes));
    }

    public void back(View view) {
        Intent si = new Intent(this, MainActivity.class);
        startActivity(si);
    }
}