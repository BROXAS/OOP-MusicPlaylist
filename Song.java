package com.ualbany.finalproject;

//Extending is example of inheritance
public class Song extends iPod {
	private String songName;
	private Artist artistInfo;
	private Album albumInfo;
	
	//Examples of composition
	public Song(String songName, Artist artistInfo, Album albumInfo) {
		this.songName = songName;
		this.artistInfo = artistInfo;
		this.albumInfo = albumInfo;
	}
	
	//Examples of polymorphism
	public void play() {
		System.out.printf("Currently playing %s!\n", songName);
	}
	
	public String toString() {
		return String.format("Song: %s \tArtist: %s \tAlbum: %s", songName, artistInfo, albumInfo);
	}
}
