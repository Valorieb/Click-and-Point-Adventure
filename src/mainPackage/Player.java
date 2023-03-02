package mainPackage;

public class Player {
	
	GameManager gm;
	
	public int playerMaxLife;
	public int playerLife;
	
	public int hasSword;
	public int hasShield;
	public int hasLantern;
	
	public Player(GameManager gm) {
		
		this.gm = gm;
		
	}
	
	
	//Call this method whenever you want to reset player stats
	public void setPlayerDefaultStatus() {
		
		playerMaxLife = 5;
		playerLife = 3;
		hasSword = 0;
		hasShield = 0;
		hasLantern = 0;
		
		updatePlayerStatus();
		
	}
	
	public void updatePlayerStatus() {
		
		//RESETS HP TO BE UPDATED.
		// ITERATES THROUGH EACH HEART AND MAKES IT INVISIBLE SO THAT NUMBER OF HP CAN REFRESH
		int i = 1;
		while(i<6) {
			gm.ui.lifeLabel[i].setVisible(false); // WHATEVER THE HP IS CURRENTLY AT, ERASE IT
			i++;
		}
		
		
		// DISPLAY PLAYER'S LIFE
		int lifeCount = playerLife;
		while(lifeCount!= 0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true); // MAKING VISIBLE THE CORRECT HEART COUNT
			lifeCount--; // WILL DISPLAY THE NTH HEART (CURRENT HP) AND THEN THE HEART BEFORE THAT, AND THE HEART BEFORE THAT, DOWN TO THE LAST HEART
		}
		
		//CHECK PLAYER ITEMS
		if(hasSword==0) {
			gm.ui.swordLabel.setVisible(false);
		}
		if(hasSword==1) {
			gm.ui.swordLabel.setVisible(true);
		}
		if(hasShield==0) {
			gm.ui.shieldLabel.setVisible(false);
		}
		if(hasShield==1) {
			gm.ui.shieldLabel.setVisible(true);
		}
		if(hasLantern==0) {
			gm.ui.lanternLabel.setVisible(false);
		}
		if(hasLantern==1) {
			gm.ui.lanternLabel.setVisible(true);
		}
		
	}

}
