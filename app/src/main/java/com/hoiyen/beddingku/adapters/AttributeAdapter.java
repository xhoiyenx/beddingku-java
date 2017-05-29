package com.hoiyen.beddingku.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hoiyen on 5/28/17.
 */

public final class AttributeAdapter extends RecyclerView.Adapter<AttributeAdapter.AttributeAdapterViewHolder> {

    class AttributeAdapterViewHolder extends RecyclerView.ViewHolder {
        public AttributeAdapterViewHolder(View item) {
            super(item);
        }
    }

    @Override
    public AttributeAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AttributeAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
