package com.nytimes.articles.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.nytimes.articles.data.local.dao.ArticleDao;
import com.nytimes.articles.data.local.entity.ArticleEntity;

/**
 * File Description
 * <p>
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
@Database(entities = {ArticleEntity.class}, version = 1)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}