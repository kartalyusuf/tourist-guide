package com.kartal.navigationdrawer2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResimDetay extends AppCompatActivity {

    ImageView imageView;
    TextView name, comment ;
    String placename,commentname;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resim_detay);

        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        comment = findViewById(R.id.comment);
        placename = getIntent().getStringExtra("name");
        commentname= getIntent().getStringExtra("comment");
        image = getIntent().getIntExtra("image",0);
        name.setText(placename);
        comment.setText(commentname);
        imageView.setImageResource(image);

    }
}