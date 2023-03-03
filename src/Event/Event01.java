package Event;

import mainPackage.GameManager;

public class Event01 {
	
	GameManager gm;
	
	public Event01(GameManager gm) {
		
		this.gm = gm;
	}
	
	public void lookHut() {
		
		gm.ui.messageText.setText("This is your house");
		
	}
	public void talkHut() {
		gm.ui.messageText.setText("Who are you talking to?");
	}
	public void restHut() {
		
		if(gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("You rest at the house. \n (Your health has been restored)");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
			
		}
		else {
			gm.ui.messageText.setText("Your health is already full");
			
		}
		
	}
	
	public void lookGuard() {
		
		gm.ui.messageText.setText("A guard is standing in front of you.");
	}
	
	public void talkGuard() {
		gm.ui.messageText.setText("GUARD: Don't go any further without a weapon!\nYou should check the chest over there!");
	}
	
	public void attackGuard() {
		if(gm.player.hasShield==0) {
			if(gm.player.hasSword==0) {
				if(gm.player.playerLife!=1) {
				gm.ui.messageText.setText("GUARD: Hey, don't be stupid!\n(The guard hits you back and your life decreases by 1)");
				gm.player.playerLife--;
				
				}
				else if(gm.player.playerLife==1) {
					gm.ui.messageText.setText("GUARD: What a fool!\n(The guard hits you back and you are dead)");
					gm.player.playerLife--;
					
				}
				
			}
			else if(gm.player.hasSword==1) {
				gm.ui.messageText.setText("GUARD: Ouch! Who told you where to find that sword?\n(You have defeated the guard and taken his shield!)");
				gm.player.hasShield=1;
			}
			gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("GUARD: Just leave me alone.");
		}
	}
	
	public void lookChest() {
		gm.ui.messageText.setText("A chest is on the ground.");
	}
	
	public void talkChest() {
		gm.ui.messageText.setText("You talk to the chest but it says nothing");
	}
	
	public void openChest() {
		
		if(gm.player.hasSword==0) {
		gm.ui.messageText.setText("You open the chest and find a sword!");
		gm.player.hasSword=1;
		gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("Empty");
		}
	}

}
