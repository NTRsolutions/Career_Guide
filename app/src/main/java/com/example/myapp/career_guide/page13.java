package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class page13 extends AppCompatActivity {
    private static ListView listView;
    private static String Name[] = {"Specialization","Eligibility for Agriculture Courses","Selection process for Agriculture Courses",
            "Courses","Colleges","Our Alumni"};
    //private static int Image[] ={R.drawable.spec_agri,R.drawable.eligible_agri,R.drawable.selection_agri,R.drawable.colleges_agri,R.drawable.alumni_agri};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);
        openListView();
    }
    public void openListView(){
        listView = (ListView)findViewById(R.id.list1);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.list_agriculture,Name);
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

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
