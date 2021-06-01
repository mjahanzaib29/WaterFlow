package com.example.smartwaterflow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;

public class RoomsActivity extends AppCompatActivity {
    Button btnon1, btnon2, btnon3, btnon4, btnoff1, btnoff2, btnoff3, btnoff4;
    ImageView  room2, room3, room4;
    Drawable drawableoff1,drawableon1,drawableoff2,drawableon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
        btnoff1 = (Button) findViewById(R.id.btnoff1);
        btnoff2 = (Button) findViewById(R.id.btnoff2);
        btnoff3 = (Button) findViewById(R.id.btnoff3);
        btnoff4 = (Button) findViewById(R.id.btnoff4);
        btnon1 = (Button) findViewById(R.id.btnon1);
        btnon2 = (Button) findViewById(R.id.btnon2);
        btnon3 = (Button) findViewById(R.id.btnon3);
        btnon4 = (Button) findViewById(R.id.btnon4);
//        room1 = (ImageView) findViewById(R.id.room1);
        room2 = (ImageView) findViewById(R.id.room2);
        room3 = (ImageView) findViewById(R.id.room3);
        room4 = (ImageView) findViewById(R.id.room4);
        GifImageView emoji;
        emoji = (GifImageView)findViewById(R.id.room1);

        btnoff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emoji.setImageResource(R.drawable.waterfill);
            }
        });

//        Glide.with(this).asGif().load(R.drawable.waterfill).into(room1);
        Glide.with(this).asGif().load(R.drawable.waterfill).into(room2);
//        Glide.with(this).asGif().load(R.drawable.waterfill).into(room3);
//        Glide.with(this).asGif().load(R.drawable.waterfill).into(room4);
//        btnoff1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                 drawableoff1 = room1.getDrawable();
//                if (drawableoff1 instanceof Animatable) {
//                    ((Animatable) drawableoff1).stop();
//                }
//            }
//        });
//        btnon1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                 drawableon1 = room1.getDrawable();
//                if (drawableon1 instanceof Animatable) {
//                    ((Animatable) drawableon1).start();
//                }
//            }
//        });

        btnoff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 drawableoff2 = room2.getDrawable();
                if (drawableoff2 instanceof Animatable) {
                    ((Animatable) drawableoff2).stop();
                }
            }
        });
        btnon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 drawableon2 = room2.getDrawable();
                if (drawableon2 instanceof Animatable) {
                    ((Animatable) drawableon2).start();
                }
            }
        });
//        btnoff3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Drawable drawable = room3.getDrawable();
//                if (drawable instanceof Animatable) {
//                    ((Animatable) drawable).stop();
//                }
//            }
//        });
//        btnon3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Drawable drawable = room3.getDrawable();
//                if (drawable instanceof Animatable) {
//                    ((Animatable) drawable).start();
//                }
//            }
//        });
//        btnoff4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Drawable drawable = room4.getDrawable();
//                if (drawable instanceof Animatable) {
//                    ((Animatable) drawable).stop();
//                }
//            }
//        });
//        btnon4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Drawable drawable = room4.getDrawable();
//                if (drawable instanceof Animatable) {
//                    ((Animatable) drawable).start();
//                }
//            }
//        });
    }
}