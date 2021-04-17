package com.example.android.toursardinia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SardiniaAdapter extends ArrayAdapter<Sardinia> {


    public SardiniaAdapter(Context context, ArrayList<Sardinia> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Sardinia currentSardinia = getItem(position);

        TextView titleTexView = listItemView.findViewById(R.id.textTitle);
        titleTexView.setText(currentSardinia.getmTitle());


        TextView descriptionTextView = listItemView.findViewById(R.id.textDescription);
        descriptionTextView.setText(currentSardinia.getmDescription());


        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentSardinia.hasImage()) {

            //get the imageResource get and set it as source of the image view
            imageView.setImageResource(currentSardinia.getmImageResourceId());

            //make the image view visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
