package com.example.burtsev_v_26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {
    ImageView imgView;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        imgView = (ImageView) findViewById(R.id.imageView14);
        txtView = (TextView) findViewById(R.id.textView4);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        };

        imgView.setOnClickListener(click);
        txtView.setOnClickListener(click);
    }


}