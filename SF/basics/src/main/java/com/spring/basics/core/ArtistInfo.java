package com.spring.basics.core;

import java.util.List;

public class ArtistInfo {

	private List<CompactDisc> compactDiscs;
	
	public ArtistInfo(List<CompactDisc> compactDiscs){
		this.compactDiscs = compactDiscs;
	}
	
	public void getArtistInfo(){
		System.out.println("Sonu Nigam - A Playback Singer");
		for(CompactDisc cd : compactDiscs){
			cd.playCD();
		}
	}
}
