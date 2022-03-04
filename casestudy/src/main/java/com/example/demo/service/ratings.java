package com.example.demo.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratings")
public class ratings {

	@Id
	String wname;
	int rating;
	String review;
	public String getwname() {
		return wname;
	}
	public void setwname(String wname) {
		this.wname = wname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public ratings(String wname, int rating, String review) {
		super();
		this.wname = wname;
		this.rating = rating;
		this.review = review;
	}
	public ratings()
	{
		
	}
}
