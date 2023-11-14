package com.csis3275.model;

public class JackFreelanceConnect {
	String bio;
	String img;
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public JackFreelanceConnect(String bio, String img) {
		super();
		this.bio = bio;
		this.img = img;
	}
	
}
