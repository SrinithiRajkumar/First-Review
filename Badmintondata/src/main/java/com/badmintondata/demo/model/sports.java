package com.badmintondata.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class sports {
	@Id
	private int sno;
	private int won;
	private String fullname;
	private String level;
	private String footwearEvaluation;
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getFootwearEvaluation() {
		return footwearEvaluation;
	}
	public void setFootwearEvaluation(String footwearEvaluation) {
		this.footwearEvaluation = footwearEvaluation;
	}
	
	
}
