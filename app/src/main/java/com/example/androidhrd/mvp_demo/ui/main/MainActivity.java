package com.example.androidhrd.mvp_demo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.androidhrd.mvp_demo.R;
import com.example.androidhrd.mvp_demo.app.App;
import com.example.androidhrd.mvp_demo.app.di.component.ActivityComponent;
import com.example.androidhrd.mvp_demo.base.BaseActivity;
import com.example.androidhrd.mvp_demo.data.UserPreferences;
import com.example.androidhrd.mvp_demo.entity.Article;
import com.example.androidhrd.mvp_demo.ui.main.mvp.ArticlePresenter;
import com.example.androidhrd.mvp_demo.ui.main.mvp.MainMvp;

import javax.inject.Inject;

public class MainActivity extends BaseActivity
implements MainMvp.View{

    private MainMvp.Presenter presenter;
    private ProgressBar progressBar;
    private Button btnSave,btnUpdate;
    private EditText title, content;

    @Inject
    UserPreferences userPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //dagger injection
        //((App) getApplication()).getApplicationComponent().inject(this);

        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);
        btnSave=findViewById(R.id.btnSave);
        title=findViewById(R.id.title);
        btnUpdate=findViewById(R.id.btnUpdate);
        content=findViewById(R.id.content);
        presenter=new ArticlePresenter();
        presenter.setView(this);

        btnSave.setOnClickListener(v->{
            Article article=new Article();
            article.setId(1);
            article.setTitle(title.getText().toString());
            article.setContent(content.getText().toString());
            //pass article to presenter
            presenter.saveArticle(article);
        });

        btnUpdate.setOnClickListener(v->{
            presenter.updateArticle(null);
        });

        //userPreferences=new UserPreferences(this);
       userPreferences.add();
    }

    @Override
    public void onInject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onSuccess(String smg) {
        Toast.makeText(this, smg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String smg) {
        Toast.makeText(this, smg, Toast.LENGTH_SHORT).show();
    }
}
