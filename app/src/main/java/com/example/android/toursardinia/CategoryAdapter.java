package com.example.android.toursardinia;

import android.content.Context;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentStatePagerAdapter;


public class CategoryAdapter extends FragmentStatePagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeachesFragment();
        } else if (position == 1) {
            return new CitiesFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new PlantsFragment();
        }
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_beaches);
        } else if (position == 1) {
            return mContext.getString(R.string.category_cities);
        } else if (position == 2) {
            return mContext.getString(R.string.category_food);
        } else {
            return mContext.getString(R.string.category_plants);        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
