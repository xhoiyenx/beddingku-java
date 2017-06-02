package com.hoiyen.beddingku;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toolbar;

import com.hoiyen.beddingku.fragments.ProductListFragment;

public class ShopActivity extends Activity {

    private static final int FRAGMENT_CONTAINER = R.id.fragment_container;
    private FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        // set toolbar
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);

        // set actionbar
        final ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_left_arrow);
        }

        // this page is start point for all product list based query
        // like category, brand, or search
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (savedInstanceState == null) {

            // load product list
            // TODO: put bundle parameters
            final ProductListFragment productListFragment = ProductListFragment.instance();
            transaction.add(FRAGMENT_CONTAINER, productListFragment);
            transaction.commit();
        }

    }

}
