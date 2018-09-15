package com.example.androidhrd.mvp_demo.app.di.module;

import android.app.Application;
import android.content.Context;

import com.example.androidhrd.mvp_demo.data.UserPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private Application application;
    public ApplicationModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return this.application;
    }
    @Provides
    @Singleton
    public Context provideContext(){
        return this.application;
    }

    @Provides
    @Singleton
    public UserPreferences provideUserPreferences(Context context) {
        return new UserPreferences(context);
    }

}
