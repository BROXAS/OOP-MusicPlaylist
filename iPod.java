package com.ualbany.finalproject;

import java.util.Collections;
import java.util.LinkedList;

// iPod will implement all the basic methods necesarry for our particular program
public class iPod extends Menu {
		

	
	// This will list the requested array we want.
	public static <T> void listRequested(T [] x) {
		int i = 0;
		for(T b:x) 
			System.out.printf("%d. %s\n", ++i, b);
			System.out.println();
	}

	// This will remove a specific track number on our playlist
	@Override
	public void removeSong(LinkedList<Song> l, int n) {
		l.remove(n-1);		
		System.out.printf("\nSong number %d deleted\n", n);
	}

	// This will shuffle the songs in our playlist
	@Override
	public void shuffle(LinkedList<Song> l) {
		System.out.printf("\nShuffled Playlist: ");
		int i = 0;
		Collections.shuffle(l);
		for (Song b: l)
			System.out.printf("\n%d.  %s", ++i, b);
			System.out.println();
		
	}

	// This will print out our playlist
	@Override
	public void display(LinkedList<Song> l) {
		System.out.printf("\nPlaylist:");
		int i = 0;
		for (Song b: l)
			System.out.printf("\n%d.  %s", ++i, b);
			System.out.println();
		
	}
	
	
}
