package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class page15a extends AppCompatActivity {
    private static ListView list;
    private static String array[] = new String[]{"Specialization", "Eligibility  for Agriculture Courses",
            "Selection process for Agriculture Courses", "Colleges for B.Tech", "Colleges for B.sc","Our Alumni"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page15a);
        listviewagriculture();
    }
    public void listviewagriculture(){
        list = (ListView)findViewById(R.id.lst);
        ArrayAdapter<String> adt = new ArrayAdapter<String>(this,R.layout.list_agri,array);
        list.setAdapter(adt);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent init = new Intent(view.getContext(), page1_agri.class);
                    startActivityForResult(init, 0);
                }
                if (position == 1) {
                    Intent init = new Intent(view.getContext(), page2_agri.class);
                    startActivityForResult(init, 0);
                }
                if (position == 2) {
                    Intent init = new Intent(view.getContext(), page3_agri.class);
                    startActivityForResult(init, 0);
                }
                if (position == 3) {
                    Intent init = new Intent(view.getContext(), page4_agri.class);
                    startActivityForResult(init, 0);
                }
                if (position == 4) {
                    Intent init = new Intent(view.getContext(), page5_agri.class);
                    startActivityForResult(init, 0);
                }
            }
        });


    }
}
