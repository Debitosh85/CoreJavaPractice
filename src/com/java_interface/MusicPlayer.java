package com.java_interface;

public class MusicPlayer implements AdvancemediaPlayer
{
	String title;
	
	
	public MusicPlayer(String title)
	{
		this.title = title;
		System.out.println("Song Title:"+this.title);
	}
	@Override
	public void play()
	{
		System.out.println("Music player playing songs....");
	}
	
	public void stop()
	{
		System.out.println("Stop music Player....");
	}
	
	public void pause()
	{
		System.out.println("Song has been paused.......");
	}

}
