package com.hoiyen.beddingku;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.hoiyen.beddingku.fragments.AttributesFragment;
import com.hoiyen.beddingku.fragments.HomeListFragment;

public class MainActivity extends Activity {

    private static final String HOME = "Home";
    private static final String CATEGORY = "Category";
    private static final int FRAGMENT_CONTAINER = R.id.fragment_container;
    private FragmentManager fragmentManager = getFragmentManager();
    private TabLayout navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navigation
        navigationView = (TabLayout) findViewById(R.id.navigation_home);
        navigationView.addOnTabSelectedListener(tabListener);

        // set actionbar layout
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);

        // set actionbar options
        final ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            //actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setLogo(R.drawable.logo);
            actionBar.setDisplayShowTitleEnabled(false);
        }

        // syncDrawer();

        // when first loading the activity, set HOME as default fragment
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (savedInstanceState == null) {
            transaction.add(FRAGMENT_CONTAINER, HomeListFragment.instance(), HOME);
            transaction.commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, Menu.NONE, R.string.text_bag).setIcon(R.drawable.ic_bag).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                // TODO: Show cart here
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Listener for TabLayout main navigation
     */
    private final TabLayout.OnTabSelectedListener tabListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            tabListener(tab);
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

    /**
     * Function for tab listener
     * @param TabLayout.Tab item
     */
    public final void tabListener(TabLayout.Tab item) {
        switch (item.getPosition()) {

            case 1:
                fragmentManager.beginTransaction()
                        .replace(FRAGMENT_CONTAINER, AttributesFragment.instance(), CATEGORY)
                        .commit();
                break;

            case 0:
                fragmentManager.beginTransaction()
                        .replace(FRAGMENT_CONTAINER, HomeListFragment.instance(), HOME)
                        .commit();
                break;

        }
    }

}
