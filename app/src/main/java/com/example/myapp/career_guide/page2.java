package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class page2 extends AppCompatActivity {
    Button  button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        openPageButtonIti();
        openPageButtonDiploma();

    }
    public void openPageButtonIti(){
        Button button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page2.this, pageIti.class);
                startActivity(toy);
            }
        });
    }
    public void openPageButtonDiploma(){
        Button button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page2.this, page6.class);
                startActivity(toy);
            }
        });
    }
}
