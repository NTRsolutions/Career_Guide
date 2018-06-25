package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.career_guide.adapter.MyAdapter;

public class page3 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        openButtonMoreAgri();
    }
    public void openButtonMoreAgri(){
        button = (Button)findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent init = new Intent(page3.this,page15a.class);
                startActivity(init);
            }
        });
    }
}
