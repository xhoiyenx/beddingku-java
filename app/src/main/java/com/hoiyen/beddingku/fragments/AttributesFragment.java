package com.hoiyen.beddingku.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.hoiyen.beddingku.R;
import com.hoiyen.beddingku.ShopActivity;
import com.hoiyen.beddingku.adapters.CategoryExpandableAdapter;

public class AttributesFragment extends Fragment {

    private Context context;

    // show shop category list
    private ExpandableListView elvCategory;

    // show brand list
    private RecyclerView rvBrand;

    // set adapter for category
    private CategoryExpandableAdapter elAdapter;

    public static AttributesFragment instance() {
        return new AttributesFragment();
    }

    public AttributesFragment() {
        super();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.context = activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inflate view for this fragment
        final View view = inflater.inflate(R.layout.fragment_attributes, container, false);

        // bind category and brand tab
        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_attribute);

        // bind listener to tablayout
        tabLayout.addOnTabSelectedListener(tabSelectedListener);

        // bind category view
        elvCategory = (ExpandableListView) view.findViewById(R.id.elv_category);

        // bind listener to category list
        elvCategory.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                // Go to product list
                context.startActivity(new Intent(getActivity(), ShopActivity.class));

                return false;
            }
        });

        // bind brand view
        rvBrand = (RecyclerView) view.findViewById(R.id.rv_brand);

        return view;

    }

    @Override
    public void onStart() {
        super.onStart();

        // put data to adapter
        elAdapter = new CategoryExpandableAdapter(context);

        // populate category and brand data
        if (elvCategory != null && rvBrand != null) {
            elvCategory.setAdapter(elAdapter);
        }

    }

    /**
     * Listener for category & brand tablayout
     */
    TabLayout.OnTabSelectedListener tabSelectedListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            switch (tab.getPosition()) {
                case 1:
                    elvCategory.setVisibility(View.INVISIBLE);
                    rvBrand.setVisibility(View.VISIBLE);
                    break;

                default:
                    rvBrand.setVisibility(View.INVISIBLE);
                    elvCategory.setVisibility(View.VISIBLE);
                    break;
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };
}
