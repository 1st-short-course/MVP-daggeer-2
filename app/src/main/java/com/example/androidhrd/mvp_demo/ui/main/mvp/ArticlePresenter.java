package com.example.androidhrd.mvp_demo.ui.main.mvp;

import com.example.androidhrd.mvp_demo.entity.Article;

public class ArticlePresenter implements MainMvp.Presenter {

    private MainMvp.View view;
    private MainMvp.Interactor interactor;
    public ArticlePresenter(){
        // TODO: 15/09/2018   interactor=
        interactor=new ArticleInteractor();
    }

    @Override
    public void saveArticle(Article article) {
        view.showLoading();
        interactor.saveArticle(article, new MainMvp.Interactor.InteractorResponse() {
            @Override
            public void onSuccess(String smg) {
                view.onSuccess(smg);
                view.hideLoading();
            }

            @Override
            public void onError(String smg) {
                view.onError(smg);
                view.hideLoading();
            }
        });
    }

    @Override
    public void updateArticle(Article article) {
        view.showLoading();
        interactor.updateArticle(article, new MainMvp.Interactor.InteractorResponse() {
            @Override
            public void onSuccess(String smg) {
                view.onSuccess(smg);
                view.hideLoading();
            }

            @Override
            public void onError(String smg) {
            view.onError(smg);
            view.hideLoading();
            }
        });
    }

    @Override
    public void setView(MainMvp.View view) {
        this.view=view;
    }
}
