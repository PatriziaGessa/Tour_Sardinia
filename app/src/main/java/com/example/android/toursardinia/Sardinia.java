package com.example.android.toursardinia;

import java.util.Objects;

public class Sardinia {


    private String mTitle;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for these items
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Sardinia(String title, String description, int imageResourceId) {
        this.mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sardinia sardinia = (Sardinia) o;
        return mTitle == sardinia.mTitle &&
                mDescription == sardinia.mDescription &&
                mImageResourceId == sardinia.mImageResourceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mTitle, mDescription, mImageResourceId);
    }
}
