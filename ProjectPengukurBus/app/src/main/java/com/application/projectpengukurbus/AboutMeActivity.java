package com.application.projectpengukurbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AboutMeActivity extends AppCompatActivity {

    CardView whatsapp, msg, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        whatsapp = findViewById(R.id.btnWhatsaap);
        msg = findViewById(R.id.btnMsg);
        email = findViewById(R.id.btnEmail);


        whatsapp.setOnClickListener(v -> {
            Toast.makeText(this, "getclick", Toast.LENGTH_SHORT).show();
            String urlString = "https://wa.me/6281228004607";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
            startActivity(intent);
        });

        msg.setOnClickListener(v -> {
            String urlString = "https://www.instagram.com/trenaedi_nafi_al_faris";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
            startActivity(intent);
        });

        email.setOnClickListener(v ->{
            String urlString = "https://www.gmail.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
            startActivity(intent);
        });
    }
}