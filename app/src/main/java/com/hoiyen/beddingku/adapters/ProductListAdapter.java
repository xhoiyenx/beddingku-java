package com.hoiyen.beddingku.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoiyen.beddingku.R;

/**
 * Created by Hoiyen on 5/28/17.
 */

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder> {

    @Override
    public ProductListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_product, parent, false);

        return new ProductListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class ProductListViewHolder extends RecyclerView.ViewHolder {
        public ProductListViewHolder(View view) {
            super(view);
        }
    }

}
