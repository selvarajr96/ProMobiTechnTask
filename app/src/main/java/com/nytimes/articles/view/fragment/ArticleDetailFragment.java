package com.nytimes.articles.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.nytimes.articles.R;
import com.nytimes.articles.common.Constants;

import com.nytimes.articles.databinding.FragmentArticleDetailsBinding;
import com.nytimes.articles.view.base.BaseFragment;
import com.nytimes.articles.viewmodel.ArticleDetailsViewModel;

/**
 * The article list fragment which is responsible for showing the article details
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 04/27/2019
 */
public class ArticleDetailFragment extends BaseFragment<ArticleDetailsViewModel, FragmentArticleDetailsBinding> {
    @Override
    protected Class<ArticleDetailsViewModel> getViewModel() {
        return ArticleDetailsViewModel.class;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_article_details;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(false);
        dataBinding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false);
        return dataBinding.getRoot();
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(false);
        Bundle args = getArguments();
        if(null != args) {
            viewModel.setUrl(args.getString(Constants.BUNDLE_KEY_ARTICLE_URL));
            viewModel.loadArticleDetails();
        }
        viewModel.getArticleEntityMutableLiveData().observe(this, articleEntity -> {
            if(null != articleEntity && null != args) {
                dataBinding.textTitle.setText(articleEntity.getTitle());
                dataBinding.textContent.setText(articleEntity.getContent());
                dataBinding.textPublishedDate.setText(args.getString(Constants.BUNDLE_KEY_ARTICLE_PUBLISHED_DATE));
                dataBinding.loadingProgress.setVisibility(View.GONE);
            }
        });

        viewModel.getErrorMessageRecieved().observe(this, message ->{
            dataBinding.loadingProgress.setVisibility(View.GONE);
            dataBinding.textContent.setText(getActivity().getString(R.string.networkError));
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_details, menu);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
// You can hide the state of the menu item here if you call getActivity().supportInvalidateOptionsMenu(); somewhere in your code
     //   MenuItem menuItem = menu.findItem(R.id.action_search);
      //  menuItem.setVisible(false);
        getActivity().invalidateOptionsMenu();
    }
}
