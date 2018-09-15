package com.example.androidhrd.mvp_demo.ui.main.mvp;

import android.os.Handler;

import com.example.androidhrd.mvp_demo.entity.Article;

public class ArticleInteractor  implements MainMvp.Interactor {
    @Override
    public void saveArticle(Article article, InteractorResponse response) {
        //save data to network
        new Handler().postDelayed(()->{
            if(article!=null){
                response.onSuccess("save success");
            }else{
                response.onError("have an error");
            }
        },2000);
    }

    @Override
    public void updateArticle(Article article, InteractorResponse response) {

        new Handler().postDelayed(()->{
            if(article!=null){
                response.onSuccess("update success");
            }else{
                response.onError("have an error");
            }
        },2000);
    }
}
