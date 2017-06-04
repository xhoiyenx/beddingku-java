package com.hoiyen.beddingku.adapters;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoiyen.beddingku.R;
import com.hoiyen.beddingku.ShopActivity;
import com.hoiyen.beddingku.fragments.AttributesFragment;
import com.hoiyen.beddingku.fragments.ProductFragment;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder> {

    @Override
    public ProductListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_product, parent, false);

        return new ProductListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductListViewHolder holder, int position) {
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ShopActivity activity = (ShopActivity) v.getContext();
                activity.getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, ProductFragment.instance())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class ProductListViewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout container;

        public ProductListViewHolder(View view) {
            super(view);
            container = (ConstraintLayout) view.findViewById(R.id.rv_container);
        }
    }

}
