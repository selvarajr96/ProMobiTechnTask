package com.nytimes.articles.di.builder;

import com.nytimes.articles.view.fragment.ArticleDetailFragment;
import com.nytimes.articles.view.fragment.ArticleListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * This builder provides android injector service to fragments
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
@Module
public abstract class FragmentBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector
    abstract ArticleListFragment contributeArticleListFragment();

    @SuppressWarnings("unused")
    @ContributesAndroidInjector
    abstract ArticleDetailFragment contributeArticleDetailFragment();

}
