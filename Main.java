package com.ualbany.finalproject;

import java.util.LinkedList;

/**
 * @author biancaroxas
 * Main driver class will implement all the functions created
 * to assure that they are all working correctly
 */
public class Main {
	
    public static void main(String[] args) {
    	iPod ipod = new iPod();
    	//	Creating our playlist
    	LinkedList<Song> beyonkaMusic = new LinkedList<Song>();
    	Artist artist1 = new Artist("Taylor Swift");
    	Artist artist2 = new Artist("Kendrick Lamar");
    	Artist artist3 = new Artist("Justin Bieber");
    	Artist artist4 = new Artist("The Chainsmokers");
    	
    	Album album1 = new Album("Red");
    	Album album2 = new Album("DAMN.");
    	Album album3 = new Album("Believe");
    	Album album4 = new Album("Memories..Do Not Open");

    	// A song must have an artist and an album it pertains to
    	Song song1 = new Song("Red", artist1, album1);
    	Song song2 = new Song("I Almost Do", artist1, album1);
    	Song song3 = new Song("LOVE", artist2, album2);
    	Song song4 = new Song("Boyfriend", artist3, album3);
    	Song song5 = new Song("Fall", artist3, album3);
    	Song song6 = new Song("Die in Your Arms", artist3, album3);
    	Song song7 = new Song("My Type", artist4, album4);
    	Song song8 = new Song("The One", artist4, album4);
    	
    	//	Adding music to our playlist
    	beyonkaMusic.add(song1);
    	beyonkaMusic.add(song2);
    	beyonkaMusic.add(song3);
    	beyonkaMusic.add(song4);
    	beyonkaMusic.add(song5);
    	beyonkaMusic.add(song6);
    	
    	//	Testing out the methods we have created
    	ipod.display(beyonkaMusic);
    	ipod.removeSong(beyonkaMusic, 3);
    	ipod.display(beyonkaMusic);
    	ipod.shuffle(beyonkaMusic);
    	
    	beyonkaMusic.add(song7);
    	beyonkaMusic.add(song8);
    	ipod.removeSong(beyonkaMusic, 1);
    	ipod.display(beyonkaMusic);
    	
    	System.out.println();
    	
    	System.out.println("We're playing music by different catagories now:");
    	//Polymorphism
    	iPod[] iPodPolymorphism = new iPod[3];
    	iPodPolymorphism[0] = artist3;
    	iPodPolymorphism[1] = album1;
    	iPodPolymorphism[2] = song2;
    	for (int i=0; i<3; i++) {
    		iPodPolymorphism[i].play();
    	}

    	
    	System.out.println();
    	
    	//Generics, using two different objects
    	Album [] albumRay = {album1, album2, album3, album4};
    	Artist [] artistRay = {artist1, artist2, artist3, artist4};
    
    	System.out.println("Listing the albums in our playlist:");
    iPod.listRequested(albumRay);
	System.out.println("Listing the artists in our playlist:");
    iPod.listRequested(artistRay);
    	
    }
}
