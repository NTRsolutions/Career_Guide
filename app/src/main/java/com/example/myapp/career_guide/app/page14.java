package com.example.myapp.career_guide.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapp.career_guide.R;
import com.example.myapp.career_guide.adapter.MyAdapter;

import java.util.ArrayList;

public class page14 extends AppCompatActivity {

    ListView list;
    ArrayList<Integer> image;
    ArrayList<String> name;
    MyAdapter myadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);
        list = (ListView)findViewById(R.id.listView);
        image = new ArrayList<>();
        name = new ArrayList<>();
        image = getImage();
        name = getName();
         myadapter = new MyAdapter(page14.this,image,name);
        list.setAdapter(myadapter);
    }

    public ArrayList<Integer> getImage() {
        image = new ArrayList<>();
        image.add(R.drawable.specialization);
        image.add(R.drawable.eligibility);
        image.add(R.drawable.selection);
        image.add(R.drawable.courses);
        image.add(R.drawable.colleges);
        image.add(R.drawable.career);
        image.add(R.drawable.alumni);
        return image;
    }
    public ArrayList<String> getName(){
        name = new ArrayList<>();
        name.add("Specialization");
        name.add("Eligibility for Agriculture Courses");
        name.add("Selection process for Agriculture Courses");
        name.add("Courses");
        name.add("Colleges");
        name.add("Career");
        name.add("Our Alumni");

        return name;
    }
}
