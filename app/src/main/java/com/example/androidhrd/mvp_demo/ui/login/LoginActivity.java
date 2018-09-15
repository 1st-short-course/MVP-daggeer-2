package com.example.androidhrd.mvp_demo.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidhrd.mvp_demo.R;
import com.example.androidhrd.mvp_demo.app.App;
import com.example.androidhrd.mvp_demo.app.di.component.ActivityComponent;
import com.example.androidhrd.mvp_demo.base.BaseActivity;
import com.example.androidhrd.mvp_demo.data.UserPreferences;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {
    @Inject
    UserPreferences userPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //((App) getApplicationContext()).getApplicationComponent().inject(this);

        setContentView(R.layout.activity_login);


    }

    @Override
    public void onInject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }
}
