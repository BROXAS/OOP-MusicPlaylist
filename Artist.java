package com.ualbany.finalproject;

public class Artist extends iPod {
	private String artistName;
	
	public Artist(String artistName) {
		this.artistName = artistName;
		
	}
	
	public void play() {
		System.out.printf("Playing %s's songs!\n", artistName);
	}
	
	
	public String toString() {
		return String.format("%s", artistName);
	}
}
