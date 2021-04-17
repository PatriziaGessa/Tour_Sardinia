package com.example.android.toursardinia;

import android.content.Context;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentStatePagerAdapter;


public class CategoryAdapter extends FragmentStatePagerAdapter {

    private Context context;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        context = context;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       if(position == 0) {
           return new BeachesFragment();
       } else {
           return new CitiesFragment();
       }
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_beaches);
        } else {
            return context.getString(R.string.category_cities);
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
