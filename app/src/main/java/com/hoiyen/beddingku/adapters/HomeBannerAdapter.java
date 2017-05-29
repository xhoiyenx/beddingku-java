package com.hoiyen.beddingku.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hoiyen.beddingku.R;

/**
 * Created by Hoiyen on 5/27/17.
 */

public final class HomeBannerAdapter extends RecyclerView.Adapter<HomeBannerAdapter.HomeBannerViewHolder> {

    public HomeBannerAdapter() {

    }

    @Override
    public HomeBannerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_banner, parent, false);

        return new HomeBannerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeBannerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class HomeBannerViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public HomeBannerViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.image);
        }
    }

}
