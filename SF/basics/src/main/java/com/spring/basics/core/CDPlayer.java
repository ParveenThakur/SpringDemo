package com.spring.basics.core;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {

	private ArtistInfo artistInfo;
	
	@Autowired
	public void setArtistInfo(ArtistInfo artistInfo){
		this.artistInfo = artistInfo;
	}
	
	public void letsPlay(){
		artistInfo.getArtistInfo();
	}
}
