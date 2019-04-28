package com.nytimes.articles.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;


import com.nytimes.articles.data.local.entity.ArticleEntity;
import com.nytimes.articles.data.remote.Resource;
import com.nytimes.articles.data.remote.repository.ArticleRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * Article List view model
 * <p>
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 04/27/2019
 */
public class ArticleListViewModel extends ViewModel {
    private final LiveData<Resource<List<ArticleEntity>>> popularArticles;

    @Inject
    public ArticleListViewModel(ArticleRepository articleRepository) {
        popularArticles = articleRepository.loadPopularArticles(7);
        System.out.print("popular article");
    }

    public LiveData<Resource<List<ArticleEntity>>> getPopularArticles() {
        return popularArticles;
    }
}
