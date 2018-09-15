package com.example.androidhrd.mvp_demo.app.di.component;

import android.content.Context;

import com.example.androidhrd.mvp_demo.app.di.module.ActivityModule;
import com.example.androidhrd.mvp_demo.app.di.scope.PerActivity;
import com.example.androidhrd.mvp_demo.ui.login.LoginActivity;
import com.example.androidhrd.mvp_demo.ui.main.MainActivity;

import dagger.Component;

@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
@PerActivity
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
    void inject(LoginActivity loginActivity);

    Context getContext();
}
