 package com.example.myapp.career_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 public class page_journalism1 extends AppCompatActivity {
    public static ListView listView;
     public static String name[] = new String[] {"Specialization", "Eligibility Criteria", "Selection Process", "Career prospect and job Oppurtunities","Colleges","Our Alumni"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_journalism1);
        listViewJournalism();
    }
     public void listViewJournalism() {
         listView = (ListView)findViewById(R.id.listView4);
         ArrayAdapter<String> adapterobj= new ArrayAdapter<String>(this, R.layout.journalism_list, name);
         listView.setAdapter(adapterobj);
         listView.setOnItemClickListener(
                 new AdapterView.OnItemClickListener() {
                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                         if (position == 0) {
                             Intent init = new Intent(view.getContext(), page_journalism2.class);
                             startActivityForResult(init, 0);
                         }
                         if (position == 1) {
                             Intent init = new Intent(view.getContext(), page_journalism3.class);
                             startActivityForResult(init, 0);
                         }
                         if (position == 2) {
                             Intent init = new Intent(view.getContext(),  page_journalism4.class);
                             startActivityForResult(init, 0);
                         }
                         if (position == 3) {
                             Intent init = new Intent(view.getContext(), page_journalism5.class);
                             startActivityForResult(init, 0);
                         }
                         if (position == 4) {
                             Intent init = new Intent(view.getContext(), page_journalism6.class);
                             startActivityForResult(init, 0);
                         }
                         if (position == 5) {
                             Intent init = new Intent(view.getContext(),  page_journalism7.class);
                             startActivityForResult(init, 0);
                         }

                     }

                 }
         );

     }
}
