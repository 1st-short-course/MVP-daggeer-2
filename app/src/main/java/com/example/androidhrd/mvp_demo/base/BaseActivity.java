package com.example.androidhrd.mvp_demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.androidhrd.mvp_demo.app.App;
import com.example.androidhrd.mvp_demo.app.di.component.ActivityComponent;
import com.example.androidhrd.mvp_demo.app.di.component.DaggerActivityComponent;
import com.example.androidhrd.mvp_demo.app.di.module.ActivityModule;

public abstract class BaseActivity extends AppCompatActivity {

    private  ActivityComponent component;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component= DaggerActivityComponent.builder()
                .applicationComponent(((App)getApplicationContext()).getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();

        onInject(component);
    }

    public abstract void onInject(ActivityComponent activityComponent);
}
