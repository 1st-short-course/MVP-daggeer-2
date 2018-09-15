package com.example.androidhrd.mvp_demo.app;

import android.app.Application;

import com.example.androidhrd.mvp_demo.app.di.component.ApplicationComponent;
import com.example.androidhrd.mvp_demo.app.di.component.DaggerApplicationComponent;
import com.example.androidhrd.mvp_demo.app.di.module.ApplicationModule;

public class App extends Application{

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent= DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
