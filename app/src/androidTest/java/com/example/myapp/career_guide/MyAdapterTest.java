package com.example.myapp.career_guide;

import android.content.Context;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapterTest extends BaseAdapter {
    public ArrayList<Integer> image;
    public ArrayList<String> name;

    public MyAdapterTest(Context context,ArrayList<Integer> image,ArrayList<String>name) {
        this.context = context;
        this.name = name;
        this.image = image;
    }

    public MyAdapterTest(ArrayList<Integer> image) {
        this.image = image;
    }

    private Context context;
    public int getCount(){
        return name.size();
    }
    public Object getItem(int position){
         return name.get(position);
    }
    public long getItemId(int position){
    return position;

}   @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context,R.layout.item_list,null);
        }
        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        TextView tv = (TextView)convertView.findViewById(R.id.textView14);
        img.setImageResource(image.get(position));
        tv.setText(name.get(position));
        return convertView;
    }
}