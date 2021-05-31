package com.example.smartwaterflow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    @Override
    protected void onStart() {
//        ImageView rocketImage = (ImageView) findViewById(R.id.image_view_glass1);
//        rocketImage.setBackgroundResource(R.drawable.fill_animation);
//        AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
//        rocketAnimation.start();
        super.onStart();
    }
}