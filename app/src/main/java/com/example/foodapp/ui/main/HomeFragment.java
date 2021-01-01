package com.example.foodapp.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.data.dao.CategoriesDao;
import com.example.foodapp.model.Category;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private final int SPAN_COUNT = 4;

    private RecyclerView mRecyclerViewCategories;

    private CategoriesDao mCategoriesDao;
    private ArrayList<Category> mCategories;
    private CategoryAdapter mCategoryAdapter;

    public HomeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_frag, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bindView(view);
        initView();
        initListener();
    }

    private void bindView(View view) {
        mRecyclerViewCategories = view.findViewById(R.id.recyclerViewCategories);
    }

    private void initView() {
        mCategoriesDao = new CategoriesDao();
        mCategories = (ArrayList<Category>) mCategoriesDao.getAll();
        mCategoryAdapter = new CategoryAdapter(getActivity(), mCategories);
        mRecyclerViewCategories.setAdapter(mCategoryAdapter);
        mRecyclerViewCategories.setLayoutManager(new GridLayoutManager(getActivity(), 4));
    }

    private void initListener() {

    }
}
