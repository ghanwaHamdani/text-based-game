//class for gems, power ups, weapons, etc.
public class PickUps {
	boolean gem;
	boolean healthPotion;
	int type;
	int inventory;
	
	public PickUps(int type) {
		this.type = type;
	}
	
	public void determineType() {
		if(type == 1) {
			//is a gem
			System.out.println("you have found a gem!");
			Player.setNumberOfGems();
		}
		
		if(type == 2) {
			//is a gem
			System.out.println("you have found a health potion!");
			Player.healthPotion();
		}
		
		if(type == 3) {
			//is a gem
			System.out.println("you have found an unknown potion!");
			Player.unknownPotion();
		}
	}
	
}
