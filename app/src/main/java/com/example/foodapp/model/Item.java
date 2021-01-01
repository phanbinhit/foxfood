package com.example.foodapp.model;

import java.util.Objects;

public class Item {

    private String mId;
    private String mTittle;
    private String mDescription;
    private Double mPrice;
    private Integer mQuantity;
    private Image mImage;

    public Item() {

    }

    public Item(String mTittle, String mDescription, Double mPrice, Integer mQuantity, Image mImage) {
        this.mTittle = mTittle;
        this.mDescription = mDescription;
        this.mPrice = mPrice;
        this.mQuantity = mQuantity;
        this.mImage = mImage;
    }

    public Item(String mId, String mTittle, String mDescription, Double mPrice, Integer mQuantity, Image mImage) {
        this.mId = mId;
        this.mTittle = mTittle;
        this.mDescription = mDescription;
        this.mPrice = mPrice;
        this.mQuantity = mQuantity;
        this.mImage = mImage;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getTittle() {
        return mTittle;
    }

    public void setTittle(String mTittle) {
        this.mTittle = mTittle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

    public Integer getQuantity() {
        return mQuantity;
    }

    public void setQuantity(Integer mQuantity) {
        this.mQuantity = mQuantity;
    }

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image mImage) {
        this.mImage = mImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return mId.equals(item.mId) &&
                mTittle.equals(item.mTittle) &&
                mDescription.equals(item.mDescription) &&
                mPrice.equals(item.mPrice) &&
                mQuantity.equals(item.mQuantity) &&
                mImage == item.mImage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId);
    }

    @Override
    public String toString() {
        return "Item{" +
                "mId='" + mId + '\'' +
                ", mTittle='" + mTittle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mPrice=" + mPrice +
                ", mQuantity=" + mQuantity +
                ", mImage=" + mImage +
                '}';
    }
}
