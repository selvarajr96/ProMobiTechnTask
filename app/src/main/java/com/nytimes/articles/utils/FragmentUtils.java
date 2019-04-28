package com.nytimes.articles.utils;

import android.support.annotation.IntDef;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.nytimes.articles.R;
import com.nytimes.articles.view.fragment.ArticleDetailFragment;
import com.nytimes.articles.view.fragment.ArticleListFragment;

/**
 * Utility class for doing all the fragment related transitions
 * <p>
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
public class FragmentUtils {

    public static final int TRANSITION_POP = 0;
    public static final int TRANSITION_FADE_IN_OUT = 1;
    public static final int TRANSITION_SLIDE_LEFT_RIGHT = 2;
    public static final int TRANSITION_SLIDE_LEFT_RIGHT_WITHOUT_EXIT = 3;
    public static final int TRANSITION_NONE = 4;

    @IntDef({TRANSITION_POP, TRANSITION_FADE_IN_OUT, TRANSITION_SLIDE_LEFT_RIGHT, TRANSITION_SLIDE_LEFT_RIGHT_WITHOUT_EXIT, TRANSITION_NONE})
    @interface FragmentAnimation {}


    private FragmentUtils() {
        // Private constructor to hide the implicit one
    }

    public static void addArticleDetailFragment(AppCompatActivity activity,ArticleDetailFragment articleDetailFragment) {
        if(null == activity)
            return;

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        fragmentManager
                .beginTransaction()
                .addToBackStack("product")
                .add(R.id.fragContainer,
                        articleDetailFragment, null).commit();
    }
    public static void replaceArticleDetailFragment(AppCompatActivity activity, ArticleListFragment articleListFragment) {
        if(null == activity)
            return;

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        fragmentManager
                .beginTransaction()
                .replace(R.id.fragContainer,
                        articleListFragment, null).commit();
    }
    
}
