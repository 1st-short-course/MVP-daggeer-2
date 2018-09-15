package com.example.androidhrd.mvp_demo.app.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.androidhrd.mvp_demo.app.di.component.ApplicationComponent;
import com.example.androidhrd.mvp_demo.app.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private AppCompatActivity activity;
    public ActivityModule(AppCompatActivity activity){
        this.activity=activity;
    }

    @PerActivity
    @Provides
    public Context provideContext(){
        return this.activity;
    }

    @Provides
    @PerActivity
    String getBaseUrl(){
        return "http://110.74.194.125:1500";
    }
}
