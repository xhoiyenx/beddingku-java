package com.hoiyen.beddingku.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoiyen.beddingku.R;

public class ProductListFragment extends Fragment {

    public static ProductListFragment instance() {
        return new ProductListFragment();
    }

    public ProductListFragment() {
        super();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_product_list, container, false);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
