package com.hoiyen.beddingku.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoiyen.beddingku.R;
import com.hoiyen.beddingku.adapters.ProductListAdapter;
import com.hoiyen.beddingku.components.ProductListComponent;

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
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set actionbar
        final ActionBar actionBar = getActivity().getActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Category Name");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_product_list, container, false);

        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_product);
        ProductListComponent.instance(recyclerView, getActivity());

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
