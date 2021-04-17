package com.example.android.toursardinia;

import java.util.Objects;

public class Sardinia {
    

    private int title;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for these items
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Sardinia(int title, int imageResourceId) {
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public int getTitle() {
        return title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sardinia sardinia = (Sardinia) o;
        return title == sardinia.title &&
                imageResourceId == sardinia.imageResourceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, imageResourceId);
    }
}
