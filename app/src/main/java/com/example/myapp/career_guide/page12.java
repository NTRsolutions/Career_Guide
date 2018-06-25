package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page12 extends AppCompatActivity {
    Button button1;
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);

        openPageTextAgriculture();
        openPageTextLiterary();
        openPageTextOther();
    }

    public void openPageTextAgriculture(){
        TextView textView1 = (TextView)findViewById(R.id.textView28);
        textView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page12.this, page3.class);
                startActivity(toy);
            }
        });
    }

    public void openPageTextOther(){
        TextView textView3 = (TextView)findViewById(R.id.textView30);
        String udata="Other";
        SpannableString content = new SpannableString(udata);
        content.setSpan(new UnderlineSpan(), 0, udata.length(), 0);
        textView3.setText(content);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page12.this, page16.class);
                startActivity(toy);

            }
        });
    }
    public void openPageTextLiterary(){
        TextView textView3 = (TextView)findViewById(R.id.textView34);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toy = new Intent(page12.this, page18.class);
                startActivity(toy);

            }
        });
    }
}
