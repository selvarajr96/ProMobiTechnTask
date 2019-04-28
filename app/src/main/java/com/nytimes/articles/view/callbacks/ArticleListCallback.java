package com.nytimes.articles.view.callbacks;

import com.nytimes.articles.data.local.entity.ArticleEntity;

/**
 * File Description
 * <p>
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 04/27/2019
 */
public interface ArticleListCallback {
    void onArticleClicked(ArticleEntity articleEntity);
}

