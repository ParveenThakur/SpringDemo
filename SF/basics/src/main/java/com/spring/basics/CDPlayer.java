package com.spring.basics;

public class CDPlayer {

	private CompactDisc compactDisc;
	
	public CDPlayer(CompactDisc compactDisc){
		this.compactDisc = compactDisc;
	}
	
	public void listenToMusic(){
		compactDisc.play();
	}
}
