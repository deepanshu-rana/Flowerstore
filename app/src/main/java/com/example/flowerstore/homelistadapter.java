package com.example.flowerstore;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class homelistadapter extends ArrayAdapter {

    Activity context;
    int images[];
    String name[];

    public homelistadapter(Activity context, int[] images, String[] name)
    {
        super(context,R.layout.homelist,name);
        this.context = context;
        this.images = images;
        this.name = name;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.homelist, null, true);
        TextView namee = v.findViewById(R.id.name);
        ImageView imagee = v.findViewById(R.id.images);
        namee.setText(name[position]);
        imagee.setImageResource(images[position]);
        return v;
    };
}
