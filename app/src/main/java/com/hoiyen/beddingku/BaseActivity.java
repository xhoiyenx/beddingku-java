package com.hoiyen.beddingku;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class BaseActivity extends Activity {

    protected DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {

        // init drawer layout
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base, null);

        // get content container
        final FrameLayout contentView = (FrameLayout) drawerLayout.findViewById(R.id.frame_layout);

        // inflate content container with assigned layout
        getLayoutInflater().inflate(layoutResID, contentView);

        // set activity content
        super.setContentView(drawerLayout);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                if (drawerLayout.isDrawerOpen(Gravity.START)) {
                    drawerLayout.closeDrawer(Gravity.START);
                } else {
                    drawerLayout.openDrawer(Gravity.START);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void syncDrawer() {
        final ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        // disable default drawer toggle icon
        drawerToggle.setDrawerIndicatorEnabled(false);

        // set custom drawer toggle icon
        drawerToggle.setHomeAsUpIndicator(R.drawable.ic_menubar);

        // inject actionbar with drawer icon
        drawerToggle.syncState();

        // inject to drawer
        drawerLayout.addDrawerListener(drawerToggle);
    }
}
