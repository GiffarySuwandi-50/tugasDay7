package com.example.restaurantreview.data.retrofit;

import com.example.restaurantreview.data.response.RestaurantResponse;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    @GET("detail/{id}")
    Call<RestaurantResponse> getRestaurant(@Path("id") String id);

}
