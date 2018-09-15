package com.example.androidhrd.mvp_demo.ui.main.mvp;

import com.example.androidhrd.mvp_demo.entity.Article;

public interface MainMvp {

     interface View{
         void showLoading();
         void hideLoading();
         void onSuccess(String smg);
         void onError(String smg);
     }

     interface Presenter{

         void saveArticle(Article article);
         void updateArticle(Article article);
         void setView(View view);
     }

     interface Interactor{
         void saveArticle(Article article,InteractorResponse response);
         void updateArticle(Article article,InteractorResponse response);

         interface  InteractorResponse{
             void onSuccess(String smg);
             void onError(String smg);
         }
     }
}
