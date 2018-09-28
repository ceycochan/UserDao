package com.nshane.userdao;

import android.app.Application;
import android.content.Context;

/**
 * Created by da on 2017-11-9.
 */

public class UserDaoApplication extends Application {
    private static UserDaoApplication mInstance;
    /**
     * 适用全局
     */
    public static Context context;

    private String userId;


    public static UserDaoApplication getInstance() {
        return mInstance;
    }

    public UserDaoApplication(String userId) {
        mInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
