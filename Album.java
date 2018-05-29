package com.ualbany.finalproject;

public class Album extends iPod {
	private String albumName;
	
	public Album(String albumName) {
		this.albumName = albumName;
	}

	public void play() {
		System.out.printf("Playing the album %s!\n", albumName);
	}
	
	public String toString() {
		return String.format("%s", albumName);
	}
	
}
