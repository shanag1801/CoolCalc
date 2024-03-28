package com.example.coolcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.tv);
        Intent gi = getIntent();
        int lastRes = gi.getIntExtra("lastRes", 0);
        tv.setText(lastRes);
    }

    public void back(View view) {
        Intent si = new Intent(this, MainActivity.class);
        startActivity(si);
    }
}