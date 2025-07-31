package com.java_interface;

public class VideoPlayer implements AdvancemediaPlayer
{
	
	String Videotitle;
	
	public VideoPlayer(String Videotitle)
	{
		this.Videotitle = Videotitle;
		System.out.println(" Video title is:"+Videotitle);
	}
	
	public void play()
	{
		System.out.println("Video player playing video");
	}
	
	public void stop()
	{
		System.out.println("Video player stopped playing video");
	}
	
	public void pause()
	{
		System.out.println("Video is paused");
	}

}
