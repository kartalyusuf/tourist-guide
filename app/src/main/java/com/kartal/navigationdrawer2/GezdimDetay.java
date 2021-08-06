package com.kartal.navigationdrawer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class GezdimDetay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gezdim_detay);

        ImageView imageView = findViewById(R.id.imageView);
        TextView ad = findViewById(R.id.ad);
        TextView aciklama = findViewById(R.id.aciklama);

        Intent intent = getIntent();
        String isim = intent.getStringExtra("isim");
        String tanim = intent.getStringExtra("aciklama");
        ad.setText(isim);
        aciklama.setText(tanim);


        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getResimsec());


        //imageView.setImageBitmap(resimsec);








    }
}