package com.example.androidhrd.mvp_demo.data;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

public class UserPreferences {

    private Context context;
    @Inject
    public UserPreferences(Context context){
        this.context=context;
    }

    public void add(){
        SharedPreferences.Editor editor =this.context.getSharedPreferences
                ("UserPreferences",Context.MODE_PRIVATE).edit();
        editor.putString("username","data");
        editor.commit();

    }

}
