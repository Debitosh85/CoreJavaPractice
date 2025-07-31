package com.java_interface;

 interface MediaPlayer {
	
	void play();
	void stop();

}
 
interface AdvancemediaPlayer extends MediaPlayer
{
	void pause();
}




