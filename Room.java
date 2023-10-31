//room class
public class Room {
	private boolean northExit;
	private boolean southExit;
	private boolean eastExit;
	private boolean westExit;
	//blank space
	String space = ("                             ");
	
	//walls
	String nWall = (" ---------------------------- ");
	String sWall = (""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ " ---------------------------- ");
	String eWall = (space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" + System.lineSeparator() +
					space + "|" );
	String wWall = ("|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" + System.lineSeparator() +
					"|" );
	//exits
	String nDoor = (" -----------      ----------- ");
	String sDoor = (""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + ""
				  + " -----------      -----------  ");
	String eDoor = ("|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                             " + System.lineSeparator() +
					"|                             " + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" );
	String wDoor = ("|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"                             |" + System.lineSeparator() +
					"                             |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" + System.lineSeparator() +
					"|                            |" );

	Room(boolean n, boolean s, boolean e, boolean w){
		this.northExit = n;
		this.southExit = s;
		this.eastExit = e;
		this.westExit = w;
	}
	
	public void drawRoom(){
		if(northExit == true) {
			System.out.println(nDoor);
		} else if(northExit == false) {
			System.out.println(nWall);
		}
		
		if(westExit == true) {
			System.out.println(wDoor);
		} else if(westExit == false) {
			System.out.println(wWall);
		}
		
		if(eastExit == true) {
			System.out.println(eDoor);
		} else if(eastExit == false) {
			System.out.println(eWall);
		}
		
		if(southExit == true) {
			System.out.println(sDoor);
		} else if(southExit == false) {
			System.out.println(sWall);
		}
		
		
		/*
		
		if(northExit == true) {
			System.out.println(nDoor);
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println(" ---------------------------- ");
			
		}
		
		if(southExit == true) {
			System.out.println(" ---------------------------- ");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println("|                            |");
			System.out.println(sDoor);
		}
		
		if(eastExit == true) {
			System.out.println(" ---------------------------- ");
			System.out.println(eDoor);
			System.out.println(" ---------------------------- ");
		}
		if(westExit == true) {
			System.out.println(" ---------------------------- ");
			System.out.println(wDoor);
			System.out.println(" ---------------------------- ");
		}
	}*/
	
	}
}
