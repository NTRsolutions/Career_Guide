package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class page16 extends AppCompatActivity {
    TextView textview1,textview2,textview3,textview4;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page16);
        openPageFashionDesignText();
        openPageFashionDesignImage();

    }
    public void openPageFashionDesignText(){
        TextView textView1 = (TextView)findViewById(R.id.textView36);
        textView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page16.this, page17.class);
                startActivity(toy);
            }
        });
    }
    public void openPageFashionDesignImage(){
        ImageView imageview = (ImageView)findViewById(R.id.imageView6);
        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page16.this, page17.class);
                startActivity(toy);
            }
        });
    }



}
