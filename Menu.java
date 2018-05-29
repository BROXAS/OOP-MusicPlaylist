package com.ualbany.finalproject;
import java.util.LinkedList;

//Abstract class with abstract methods, this will serve as the Menu of an iPod
public abstract class Menu {
		
		public abstract void removeSong(LinkedList<Song> l, int n) ;
		public abstract void shuffle(LinkedList<Song> l);
		public abstract void display(LinkedList<Song> l);
		
		// This is a mock playing method, it will play a different thing as requested per program
		// Ex: Song it will play by song, Artist it will play by artist, Album it will play by album
		public void play() {
			System.out.println("Playing...la la la");
		}
}
