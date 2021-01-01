package com.example.foodapp.model;

import com.example.foodapp.R;

public enum Image {

    BEAR(R.drawable.ic_categories_bear),
    BREAKFAST(R.drawable.ic_categories_breakfast),
    COFFEE(R.drawable.ic_categories_coffee),
    CREAM(R.drawable.ic_categories_cream),
    DRINK(R.drawable.ic_categories_drink),
    FAST_FOOD(R.drawable.ic_categories_fast_food),
    FULL_FOOD(R.drawable.ic_categories_full_food),
    DRINK_GAS(R.drawable.ic_categories_gas);

    private int imageCode;

    Image(int imageCode) {
        this.imageCode = imageCode;
    }

    public int getImageCode() {
        return imageCode;
    }
}
