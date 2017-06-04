package com.hoiyen.beddingku.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoiyen.beddingku.R;
import com.hoiyen.beddingku.adapters.HomeBannerAdapter;

/**
 * Created by Hoiyen on 5/27/17.
 */

public final class HomeListFragment extends Fragment {

    private HomeBannerAdapter bannerAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    public static HomeListFragment instance() {
        return new HomeListFragment();
    }

    public HomeListFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // init banner adapter
        bannerAdapter = new HomeBannerAdapter();

        // init banner layout
        layoutManager = new LinearLayoutManager(context);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // init banner adapter
        bannerAdapter = new HomeBannerAdapter();

        // init banner layout
        layoutManager = new LinearLayoutManager(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home_list, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_home_banner);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bannerAdapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
