package com.hoiyen.beddingku.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hoiyen.beddingku.adapters.ProductListAdapter;

/**
 * Created by Hoiyen on 5/28/17.
 * Show product list from recyclerview
 */

public class ProductListComponent {

    // recyclerview adapter
    private ProductListAdapter adapter;

    // activity / fragment context
    private Context context;

    public static void instance(RecyclerView rv, Context context) {
        new ProductListComponent(rv, context);
    }

    private ProductListComponent(RecyclerView rv, Context context) {
        this.context = context;

        // setting up adapter
        adapter = new ProductListAdapter();

        // setting up recyclerview
        rv.setLayoutManager(new GridLayoutManager(this.context, 2));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        // set decoration
        rv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);

                final int position = parent.getChildAdapterPosition(view);
                outRect.bottom = 1;
            }
        });
    }
}
