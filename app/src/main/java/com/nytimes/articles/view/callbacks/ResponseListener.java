package com.nytimes.articles.view.callbacks;

import com.nytimes.articles.data.local.entity.ArticleEntity;

/**
 * * Author: Selvaraj R
 *  * Email: selvarajr96@gmail.com
 *  * Created: 04/27/2019
 */
public interface ResponseListener {

    void onSuccess(ArticleEntity data);
    void onFailure(String message);
}
