package com.example.shubham_pc.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
RadioButton  radio_button_one,radio_button_two,radio_button_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       radio_button_one = (RadioButton) findViewById(R.id.radio_button_one);
        radio_button_two = (RadioButton) findViewById(R.id.radio_button_two);
        radio_button_three = (RadioButton) findViewById(R.id.radio_button_three);














    }
}
