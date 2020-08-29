package com.e.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable batteryAnimation;
    ImageView image_view;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_view = findViewById(R.id.image_view);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);

        SpinnerAdapter spinnerAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                new String[]{"Hi","Hello","Bye"});
        spinner.setAdapter(spinnerAdapter);

        image_view.setBackgroundResource(R.drawable.battery_animation);
        batteryAnimation = (AnimationDrawable) image_view.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        batteryAnimation.start();
    }
}