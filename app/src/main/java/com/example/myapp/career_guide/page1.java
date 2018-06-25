package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class page1 extends AppCompatActivity {
TextView textView1, textview2;
    Button button1,button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        openPageButtonTenth();
        openPageButtonTwelve();
    }
    public void openPageButtonTenth(){
        Button button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page1.this, page2.class);
                startActivity(toy);
            }
        });
    }
    public void openPageButtonTwelve(){
        Button button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page1.this, page12.class);
                startActivity(toy);
            }
        });
    }
}
