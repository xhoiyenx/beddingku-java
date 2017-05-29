package com.hoiyen.beddingku.components;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hoiyen.beddingku.adapters.ProductListAdapter;

/**
 * Created by Hoiyen on 5/28/17.
 * Show product list from recyclerview
 */

public class ProductListComponent {

    // injected recyclerview
    private RecyclerView rv;

    // recyclerview adapter
    private ProductListAdapter adapter;

    // activity / fragment context
    private Context context;

    public static ProductListComponent instance(RecyclerView rv, Context context) {
        return new ProductListComponent(rv, context);
    }

    private ProductListComponent(RecyclerView rv, Context context) {
        this.rv = rv;
        this.context = context;

        // setting up adapter
        adapter = new ProductListAdapter();

        // setting up recyclerview
        rv.setLayoutManager(new GridLayoutManager(this.context, 2));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
}
