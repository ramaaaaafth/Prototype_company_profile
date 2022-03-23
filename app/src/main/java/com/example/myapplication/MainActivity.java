package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView gbr1;
    ImageView gbr2;
    ImageView gbr3;
    ImageView gbr4;
    ImageView gbr5;
    ImageView gbr6;
    ImageView gbr7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gbr1 = findViewById(R.id.gbr1);


        gbr1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);

            }
        });
        gbr2 = findViewById(R.id.gbr2);


        gbr2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, GuruActivity.class);
                startActivity(intent);

            }
        });
        gbr3 = findViewById(R.id.gbr3);


        gbr3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, PrestasiActivity.class);
                startActivity(intent);

            }
        });
        gbr4 = findViewById(R.id.gbr4);


        gbr4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);

            }
        });
        gbr5 = findViewById(R.id.gbr5);


        gbr5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, KepalaActivity.class);
                startActivity(intent);

            }
        });
        gbr6 = findViewById(R.id.gbr6);


        gbr6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
                startActivity(intent);

            }
        });
        gbr7 = findViewById(R.id.gbr7);


        gbr7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, EkstakurikulerActivity.class);
                startActivity(intent);

            }
        });

    }
}