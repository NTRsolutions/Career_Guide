package com.example.myapp.career_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class page_fashion1 extends AppCompatActivity {
    ListView listview;
    String[] name = {"Specialization","Eligibility","Selection process","Colleges ", "our Alumni"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_fashion1);
    }
    public void List(){
        listview = (ListView)findViewById(R.id.listView3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.fashion_list,name);
        listview.setAdapter(adapter);

    }
}
