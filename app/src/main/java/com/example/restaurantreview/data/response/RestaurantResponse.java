package com.example.restaurantreview.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestaurantResponse{

	@SerializedName("restaurant")
	private Restaurant restaurant;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;
	private List<CustomerReviewsItem> customerReviews;

	public Restaurant getRestaurant(){
		return restaurant;
	}

	public boolean isError(){
		return error;
	}

	public String getMessage(){
		return message;
	}

	public List<CustomerReviewsItem> getCustomerReviews() {
		return customerReviews;
	}

	public void setCustomerReviews(List<CustomerReviewsItem> customerReviews) {
		this.customerReviews = customerReviews;
	}
}