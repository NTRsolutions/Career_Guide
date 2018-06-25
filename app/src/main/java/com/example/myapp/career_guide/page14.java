package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class page14 extends AppCompatActivity {
    private static ListView lst;
    private static String[] Names = new String[]{"Specialization", "Eligibility for Agriculture Courses",
            "Selection process for Agriculture Courses", "Courses", "Colleges", "Our Alumni"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page142);
        openListView();
    }

    public void openListView() {
        lst = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_agri, Names);
        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent init = new Intent(view.getContext(), page7.class);
                    startActivityForResult(init, 0);
                }
                if (position == 1) {
                    Intent init = new Intent(view.getContext(), page9.class);
                    startActivityForResult(init, 0);
                }
                if (position == 2) {
                    Intent init = new Intent(view.getContext(), page10.class);
                    startActivityForResult(init, 0);
                }
                if (position == 3) {
                    Intent init = new Intent(view.getContext(), page11.class);
                    startActivityForResult(init, 0);
                }
            }
        });



    }


}