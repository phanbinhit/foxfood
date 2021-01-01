package com.example.foodapp.ui.main;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodapp.R;
import com.example.foodapp.data.dao.CategoriesDao;
import com.example.foodapp.model.Category;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView mImgActionBar;
    private BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        bindView();
        initView();
        initListener();
    }

    private void bindView() {
        mImgActionBar = findViewById(R.id.imgActionBar);
        mBottomNavigation = findViewById(R.id.bottomNavigation);
    }

    private void initView() {
        loadFragment(new HomeFragment());
        Glide.with(this).load(R.drawable.gif_cute).into(mImgActionBar);
    }

    private void initListener() {

    }

    private void loadFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bottom_navigation_home: {
                loadFragment(new HomeFragment());
            }
            case R.id.bottom_navigation_history: {
                loadFragment(new HistoryFragment());
            }
            case R.id.bottom_navigation_account: {
                loadFragment(new AccountFragment());
            }
        }
        return false;
    }
}
