package com.example.foodapp.data.dao;

import com.example.foodapp.model.Category;
import com.example.foodapp.model.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoriesDao {

    public List<Category> getAll() {

        Category category1 = new Category("Bear", Image.BEAR);
        Category category2 = new Category("BreakFast", Image.BREAKFAST);
        Category category3 = new Category("Coffee", Image.COFFEE);
        Category category4 = new Category("Cream", Image.CREAM);
        Category category5 = new Category("Drink", Image.DRINK);
        Category category6 = new Category("Noodle", Image.FULL_FOOD);
        Category category7 = new Category("Fast Food", Image.FAST_FOOD);
        Category category8 = new Category("Drink Gas", Image.DRINK_GAS);

        List<Category> categories = new ArrayList<>(Arrays.asList(category1, category2, category3, category4,
                category5, category6, category7, category8));

        return categories;
    }
}
