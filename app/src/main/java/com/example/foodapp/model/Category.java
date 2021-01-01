package com.example.foodapp.model;

import java.util.Objects;

public class Category {

    private String mId;
    private String mTitle;
    private Image mImage;

    public Category() {

    }

    public Category(String id, String title, Image image) {
        this.mId = id;
        this.mTitle = title;
        this.mImage = image;
    }

    public Category(String mTitle, Image mImage) {
        this.mTitle = mTitle;
        this.mImage = mImage;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image mImage) {
        this.mImage = mImage;
    }

    @Override
    public String toString() {
        return "Category{" +
                "mId='" + mId + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mImage=" + mImage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return mId.equals(category.mId) &&
                mTitle.equals(category.mTitle) &&
                mImage == category.mImage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId);
    }
}
