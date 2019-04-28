package com.nytimes.articles.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;

import com.nytimes.articles.R;
import com.nytimes.articles.databinding.ActivityMainBinding;
import com.nytimes.articles.utils.FragmentUtils;
import com.nytimes.articles.view.base.BaseActivity;
import com.nytimes.articles.view.fragment.ArticleListFragment;

import static com.nytimes.articles.utils.FragmentUtils.TRANSITION_NONE;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        subscribeNavigationHandler();
        FragmentUtils.replaceArticleDetailFragment(this, ArticleListFragment.newInstance());
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // int stackHeight = getSupportFragmentManager().getBackStackEntryCount();
            case android.R.id.home:
                getSupportFragmentManager().popBackStack();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void subscribeNavigationHandler() {
        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                int stackHeight = getSupportFragmentManager().getBackStackEntryCount();
                if (stackHeight > 0) { // if we have something on the stack (doesn't include the current shown fragment)
                    getSupportActionBar().setHomeButtonEnabled(true);
                    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                } else {
                    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                    getSupportActionBar().setHomeButtonEnabled(false);
                }
            }

        });
    }
}
