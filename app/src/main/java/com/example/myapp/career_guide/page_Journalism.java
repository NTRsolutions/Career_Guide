package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_Journalism extends AppCompatActivity {
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page__journalism);
        openPageJurnalismMore();
    }
    public void openPageJurnalismMore(){
        Button btn = (Button)findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page_Journalism.this, page_journalism1.class);
                startActivity(toy);
            }
        });
    }

}
