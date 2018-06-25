package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page17 extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page17);
        openPageFashionDesignMore();
    }
    public void openPageFashionDesignMore(){
        btn1 =(Button)findViewById(R.id.button7);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page17.this, page_fashion1.class);
                startActivity(toy);
            }
        });
    }
}
