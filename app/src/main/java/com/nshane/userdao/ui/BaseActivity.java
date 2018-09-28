package com.nshane.userdao.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.nshane.userdao.R;


/**
 * @author zhaoritian
 * @date
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected abstract int getLayoutResId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
//
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(getLayoutResId());

    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }


    public void setToolbar(@Nullable View view, @Nullable String title, @Nullable Drawable icon) {
        Toolbar mTb = (Toolbar) view.findViewById(R.id.tb_toolbar);
        mTb.setTitle(title);
        mTb.setTitleTextColor(getResources().getColor(R.color.colorToolBarBText));
        mTb.setNavigationIcon(icon);
        setSupportActionBar(mTb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
