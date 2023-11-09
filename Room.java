//room class
import java.util.Scanner;

public class Room {
	  private int ID;
	  private int exitNorth;
	  private int exitEast;
	  private int exitSouth;
	  private int exitWest;

	//Constructor
	public Room(int ID, int n, int s, int e, int w){
		this.ID = ID;
		this.exitNorth = n;
		this.exitEast = e;
		this.exitSouth = s;
		this.exitWest = w;
	}
	
	public void drawRoom() {
		if(exitNorth != this.ID && exitEast != this.ID && exitSouth != this.ID && exitWest != this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "              \r\n"
							 + "              \r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			
			//id = 1
				 
		} 
		
		else if (exitNorth != this.ID && exitEast != this.ID && exitSouth == this.ID && exitWest != this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "              \r\n"
							 + "              \r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 2
		} 
		
		else if (exitNorth != this.ID && exitEast == this.ID && exitSouth != this.ID && exitWest != this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			//id = 3
		} 
		
		else if (exitNorth == this.ID && exitEast != this.ID && exitSouth != this.ID && exitWest != this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "              \r\n"
							 + "              \r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			//id = 4
		} 
		
		else if (exitNorth != this.ID && exitEast != this.ID && exitSouth != this.ID && exitWest == this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			//id = 5
		} 
		
		else if (exitNorth != this.ID && exitEast == this.ID && exitSouth == this.ID && exitWest != this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 6
		} 
		
		else if (exitNorth != this.ID && exitEast != this.ID && exitSouth == this.ID && exitWest == this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx         \r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 7
		} 
		
		else if (exitNorth == this.ID && exitEast == this.ID && exitSouth != this.ID && exitWest != this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "         xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			//id = 8
		} 
		
		else if (exitNorth == this.ID && exitEast != this.ID && exitSouth != this.ID && exitWest == this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
						     + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx    xxxxx\r\n"
				    		 + "xxxxx    xxxxx\n");
			//id = 9
		} 
		
		else if (exitNorth != this.ID && exitEast == this.ID && exitSouth != this.ID && exitWest == this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\n");
			//id = 10
		} 
		
		else if (exitNorth == this.ID && exitEast != this.ID && exitSouth == this.ID && exitWest != this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
			 				 + "xxxxxxxxxxxxxx\r\n"
							 + "              \r\n"
							 + "              \r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 11
		} 
		
		else if (exitNorth != this.ID && exitEast == this.ID && exitSouth == this.ID && exitWest == this.ID) {
			System.out.println("xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxx    xxxxx\r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 12
		} 
		
		else if (exitNorth == this.ID && exitEast != this.ID && exitSouth == this.ID && exitWest == this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxx         \r\n"
							 + "xxxxx         \r\n"
							 + "xxxxxxxxxxxxxx\r\n"
							 + "xxxxxxxxxxxxxx\n");
			//id = 13
		} 
		
		else if (exitNorth == this.ID && exitEast == this.ID && exitSouth != this.ID && exitWest == this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
						 	 + "xxxxxxxxxxxxxx\r\n"
						 	 + "xxxxx    xxxxx\r\n"
						 	 + "xxxxx    xxxxx\r\n"
						 	 + "xxxxx    xxxxx\r\n"
						 	 + "xxxxx    xxxxx\n");
			//id = 14
		} 
		
		else if (exitNorth == this.ID && exitEast == this.ID && exitSouth == this.ID && exitWest != this.ID) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
						 	 + "xxxxxxxxxxxxxx\r\n"
						  	 + "         xxxxx\r\n"
							 + "         xxxxx\r\n"
					 		 + "xxxxxxxxxxxxxx\r\n"
					 		 + "xxxxxxxxxxxxxx\n");
			//id = 15
			}
		}
	
	public String chooseExit() {
		String movement;		
		System.out.println("Where would you like to move? (N, E, S, W)");
		Scanner scan = new Scanner(System.in);
		movement = scan.nextLine(); 
		return movement;
	}
	public void moveRoom(Room[] map, String chooseExitReturn, int currentRoom) {
		// takes return value of movement and adds it to the room to move user to next room
		if(chooseExitReturn.equals("N") && currentRoom != map[currentRoom].exitNorth ) {
			map[map[currentRoom].exitNorth].drawRoom();		
			currentRoom = map[currentRoom].exitNorth;
		} else if(chooseExitReturn.equals("E") && currentRoom != map[currentRoom].exitEast) {
			map[map[currentRoom].exitEast].drawRoom();
			currentRoom = map[currentRoom].exitEast;
		}  else if(chooseExitReturn.equals("S") && currentRoom != map[currentRoom].exitSouth) {
			map[map[currentRoom].exitSouth].drawRoom();
			currentRoom = map[currentRoom].exitSouth;
		}  else if(chooseExitReturn.equals("W") && currentRoom != map[currentRoom].exitWest) {
			map[map[currentRoom].exitWest].drawRoom();
			currentRoom = map[currentRoom].exitWest;
		} else {
			System.out.println("There is no exit that way... Try Again");
		}
		moveRoom(map, chooseExit(),currentRoom);
	}
}
