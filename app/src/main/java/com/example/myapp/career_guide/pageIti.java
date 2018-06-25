package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageIti extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_iti2);
        openPageButtonItiIndia();
        openPageButtonItiMp();
    }
    public void openPageButtonItiIndia(){
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(pageIti.this, page4.class);
                startActivity(toy);
            }
        });
    }
    public void openPageButtonItiMp(){
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(pageIti.this, page5.class);
                startActivity(toy);
            }
        });
    }
}
