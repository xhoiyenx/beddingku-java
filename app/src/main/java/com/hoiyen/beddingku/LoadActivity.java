package com.hoiyen.beddingku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LoadActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(LoadActivity.this, MainActivity.class));
        finish();
    }

}
