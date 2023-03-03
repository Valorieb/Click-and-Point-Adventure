package mainPackage;

import java.net.URL;

import Event.Event01;
import Event.Event02;

public class GameManager {
	
	ActionHandler aHandler = new ActionHandler(this);
	public UI ui = new UI(this);
	public Player player = new Player(this);
	public SceneChanger sChanger = new SceneChanger(this);
	Music music = new Music();
	SE se = new SE();
	
	public Event01 ev1 = new Event01(this);
	public Event02 ev2 = new Event02(this);
	
	//SOUND
	//Note: Do not try to use mp3s. Has to be wav files.
	//Note: Compress any sound files that are not working to 16 bits
	public URL fieldMusic = getClass().getClassLoader().getResource("audio/acousticbreeze.wav");
	public URL fieldMusic2 = getClass().getClassLoader().getResource("audio/ofeliasdream.wav");
	
	public URL gameOver = getClass().getClassLoader().getResource("audio/gameOver1.wav");
	public URL heal = getClass().getClassLoader().getResource("audio/heal.wav");
	public URL slash = getClass().getClassLoader().getResource("audio/slash.wav");
	public URL success = getClass().getClassLoader().getResource("audio/success.wav");
	
	
	public URL guard_01 = getClass().getClassLoader().getResource("audio/dontGoWeapon.wav");
	public URL guard_02 = getClass().getClassLoader().getResource("audio/fool.wav");
	public URL guard_03 = getClass().getClassLoader().getResource("audio/leaveAlone.wav");
	public URL guard_04 = getClass().getClassLoader().getResource("audio/ouch.wav");
	public URL guard_05 = getClass().getClassLoader().getResource("audio/stupid.wav");
	
	public URL currentMusic;

	public static void main (String[] args) {
	
		new GameManager();
	
}
	public GameManager() {
		
		currentMusic = fieldMusic;
		playMusic(currentMusic);
		
		player.setPlayerDefaultStatus();
		sChanger.showScene1();
		
	}
	
	public void playSE(URL url) {
		se.setFile(url);
		se.play(url);
	}
	
	public void playMusic(URL url) {
		music.setFile(url);
		music.play(url);
		music.loop(url);
	}
	
	public void stopMusic(URL url) {
		
		music.stop(url);
	}
	
}
