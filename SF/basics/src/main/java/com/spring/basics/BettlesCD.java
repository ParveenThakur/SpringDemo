package com.spring.basics;

import java.io.PrintStream;

public class BettlesCD implements CompactDisc{

	private PrintStream printStream;
	
	public BettlesCD(PrintStream printStream){
		this.printStream = printStream;
	}
	
	public String getTitle() {
		return "Bettles-Track1";
	}

	public void play() {
		printStream.println("Playing the song from : "+getTitle());
	}

}
