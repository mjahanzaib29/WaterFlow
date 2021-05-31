package com.example.smartwaterflow;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class RoomsActivity extends AppCompatActivity {
    Button btnon1,btnoff1;
    ImageView room1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
        btnoff1 = (Button) findViewById(R.id.btnoff1);
        room1 = (ImageView) findViewById(R.id.room1);
        Glide.with(this).asGif().load(R.drawable.waterfill).into(room1);
        btnoff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable drawable = room1.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).stop();
                }
            }
        });
    }
}