package com.example.flowerstore;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ListView;


public class Homefragment extends AppCompatActivity {
    ListView homefragment;
    String[] name={"Flower Store","Electronics","Furniture"};
    int[] images={R.drawable.flower9,R.drawable.facebook,R.drawable.google};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homefragment);

        homefragment=findViewById(R.id.homefragment);
        homelistadapter adapter= new homelistadapter(Homefragment.this,images,name);

        homefragment.setAdapter(adapter);
    }
}
