package com.csis3275.model;

public class Kithmal_FREELANCECONNECT {
	private String bio;
	private String img;
	
	public Kithmal_FREELANCECONNECT(String bio, String img){
		this.bio = bio;
		this.img = img;
	}
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String image) {
		this.img = image;
	}
}
