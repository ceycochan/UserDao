package com.nshane.userdao.ui;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.nshane.userdao.R;

public class MainActivity extends BaseActivity {

    private NavigationView mNavView;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();

        initListener();

    }

    private void initListener() {
        mNavView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_camera:
                        Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
                        break;
                }


                return false;
            }
        });
    }


    private void initView() {
        setToolbar(getWindow().getDecorView(), "MainActivity", null);
        mNavView = (NavigationView) findViewById(R.id.navigation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    }


}
