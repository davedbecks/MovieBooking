package com.javaproject.model;

import java.util.List;

public class Movie {

	private String movieId;
	private String movieTitle;
	private String description;
	private String posterURL;
	private int runningTime;
	private List<ShowTime> showList;
	
	
	public List<ShowTime> getShowList() {
		return showList;
	}
	public void setShowList(List<ShowTime> showList) {
		this.showList = showList;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPosterURL() {
		return posterURL;
	}
	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	
}
