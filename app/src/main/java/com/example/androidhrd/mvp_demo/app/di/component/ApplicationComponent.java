package com.example.androidhrd.mvp_demo.app.di.component;

import com.example.androidhrd.mvp_demo.app.di.module.ApplicationModule;
import com.example.androidhrd.mvp_demo.ui.login.LoginActivity;
import com.example.androidhrd.mvp_demo.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(LoginActivity loginActivity);
}
