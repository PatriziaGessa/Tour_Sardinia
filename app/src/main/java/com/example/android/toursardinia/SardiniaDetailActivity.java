package com.example.android.toursardinia;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import org.w3c.dom.Text;

import java.util.Set;

public class SardiniaDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent i = getIntent();

        ImageView image = findViewById(R.id.detail_photo);
        String imageItem = i.getStringExtra("Image");
        image.setImageResource(Integer.parseInt(imageItem));


        TextView title = findViewById(R.id.detail_title);
        String titleItem = i.getStringExtra("Title");
        title.setText(titleItem);


        TextView description = findViewById(R.id.detail_description);
        String descriptionItem = i.getStringExtra("Description");
        description.setText(descriptionItem);


    }


}
