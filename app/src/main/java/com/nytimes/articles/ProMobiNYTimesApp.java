package com.nytimes.articles;

import android.app.Activity;
import android.app.Application;

import com.nytimes.articles.di.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 *
 * * Author: Selvaraj R
 *  * Email: selvarajr96@gmail.com
 *  * Created: 04/27/2019
 */
public class ProMobiNYTimesApp extends Application implements HasActivityInjector {

    private static ProMobiNYTimesApp sInstance;


    public static ProMobiNYTimesApp getAppContext() {
        return sInstance;
    }



    private static synchronized void setInstance(ProMobiNYTimesApp app) {
        sInstance = app;
    }
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeComponent();
        setInstance(this);
    }

    private void initializeComponent() {
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingInjector;
    }
}
