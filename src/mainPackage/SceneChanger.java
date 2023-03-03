package mainPackage;

public class SceneChanger {
	
	GameManager gm;
	
	public SceneChanger(GameManager gm) {
		this.gm = gm;
	}
	
	public void showScene1() {
		
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messageText.setText("Let's defeat the Demon Lord and save the world!");
	}
	
public void showScene2() {
		
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		
		gm.ui.messageText.setText("This is scene 2");
	}

public void showScene3() {
	
	gm.ui.bgPanel[2].setVisible(false);
	gm.ui.bgPanel[3].setVisible(true);
	gm.ui.messageText.setText("You entered the cave. What is waiting for you inside...\n\n"
			+ "***This is the end of the demo. Thank you for Playing!!!***");
}

}
