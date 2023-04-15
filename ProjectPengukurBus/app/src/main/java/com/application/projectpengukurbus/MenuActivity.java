package com.application.projectpengukurbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MenuActivity extends AppCompatActivity {

    CardView accelerometter, camera;
    CardView aboutme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        accelerometter = findViewById(R.id.accelerometer);
        camera = findViewById(R.id.cameraAccelerometer);
        aboutme = findViewById(R.id.aboutme);

        aboutme.setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, AboutMeActivity.class)));
        accelerometter.setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, AcceleroActivity.class)));
        camera.setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, CameraActivity.class)));
    }
}