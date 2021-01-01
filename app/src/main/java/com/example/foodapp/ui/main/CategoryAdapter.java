package com.example.foodapp.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodapp.R;
import com.example.foodapp.model.Category;
import com.example.foodapp.model.Image;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{

    private Context mContext;
    private ArrayList<Category> mCategories;

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        this.mContext = context;
        this.mCategories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mCategories.get(position);
        Glide.with(mContext).load(category.getImage().getImageCode()).into(holder.mImgCategory);
        holder.mTvCategory.setText(category.getTitle());
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImgCategory;
        private TextView mTvCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            mImgCategory = itemView.findViewById(R.id.imgCategory);
            mTvCategory = itemView.findViewById(R.id.tvCategory);
        }
    }
}
