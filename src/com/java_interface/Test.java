package com.java_interface;

public class Test {

	public static void main(String[] args) {
	
		MusicPlayer m1 = new MusicPlayer("");
		m1.play();
		m1.stop();
		m1.pause();
		
	    
		
		System.out.println("..........................");
		
		VideoPlayer v1 = new VideoPlayer("cccc");
		v1.play();
		v1.stop();
		v1.pause();
	}

}
