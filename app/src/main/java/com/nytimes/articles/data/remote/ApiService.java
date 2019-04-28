package com.nytimes.articles.data.remote;

import com.nytimes.articles.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The APIService interface which will contain the semantics of all the REST calls.
 * Author: Selvaraj R
 * Email: selvarajr96@gmail.com
 * Created: 27-apr-2019
 * Modified: 27-apr-2019
 */
public interface ApiService {

    @GET("svc/mostpopular/v2/emailed/{index}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("index") int index);
}
