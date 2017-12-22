package com.hxs.didiplugindemo;

import android.app.Application;
import android.content.Context;

import com.didi.virtualapk.PluginManager;

/**
 * 方法名：
 * 方法描述：
 * 作者：韩雪松 on 2017/12/19 15:35
 * 邮箱：15245605689@163.com
 */

public class BaseApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
    }

}
