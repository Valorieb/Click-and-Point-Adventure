package Event;

import mainPackage.GameManager;

public class Event02 {
	
	public GameManager gm;
	
	public Event02(GameManager gm) {
		
		this.gm = gm;
	}
	
	public void lookCave() {
		gm.ui.messageText.setText("It's a cave!");
		
	}
	public void talkCave() {
		gm.ui.messageText.setText("You hear the echo of your own voice.");
		
	}
	
	public void enterCave() {
		if(gm.player.hasLantern==0) {
		gm.ui.messageText.setText("It's too dark to enter.");
		}
		else {
			gm.sChanger.showScene3();
			
		}
		
	}
	
	
	public void lookRoot() {
		if (gm.player.hasLantern==0) {
		gm.ui.messageText.setText("Something is glimmering near the base of that tree.");
		}
		else {
			gm.ui.messageText.setText("This is a large tree.");
			
		}
		
	}
	public void talkRoot() {
		gm.ui.messageText.setText("They say plants grow well if you talk to them but this tree doesn't look like it needs encouragement.");
		
	}
	
	public void searchRoot() {
		if(gm.player.hasLantern==0) {
		gm.ui.messageText.setText("You find a lantern!");
		gm.player.hasLantern = 1;
		gm.player.updatePlayerStatus();
		gm.playSE(gm.success);
		}
		else {
			gm.ui.messageText.setText("There's nothing there.");
		}
		
	}

}
