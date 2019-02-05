package com.shakeel.telstra.retrofit;

import com.shakeel.telstra.model.Feed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FeedService {

    @GET("/s/2iodh4vg0eortkl/facts.js")
    Call<Feed> getFeeds();
}
