//room class
public class Room {
	private boolean northExit;
	private boolean southExit;
	private boolean eastExit;
	private boolean westExit;

	//Constructor
	public Room(boolean n, boolean s, boolean e, boolean w){
		this.northExit = n;
		this.southExit = s;
		this.eastExit = e;
		this.westExit = w;
	}


	public void drawRoom(){
		//FOUR EXITS
		if(northExit == true && southExit == true && eastExit == true && westExit == true) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "              \r\n"
					 + "              \r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		
		//THREE EXITS
		if(northExit == false && southExit == true && eastExit == true && westExit == true) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "              \r\n"
					 + "              \r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		if(northExit == true && southExit == false && eastExit == true && westExit == true) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "              \r\n"
					 + "              \r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == true && southExit == true && eastExit == false && westExit == true) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "         xxxxx\r\n"
					 + "         xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
		}
		
		if(northExit == true && southExit == true && eastExit == true && westExit == false) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		//TWO EXITS
		if(northExit == false && southExit == false && eastExit == true && westExit == true) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "              \r\n"
					 + "              \r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == false && southExit == true && eastExit == false && westExit == true) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "         xxxxx\r\n"
					 + "         xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		if(northExit == false && southExit == true && eastExit == true && westExit == false) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		if(northExit == true && southExit == false && eastExit == false && westExit == true) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "         xxxxx\r\n"
					 + "         xxxxx\r\n"
					+ "xxxxxxxxxxxxxx\r\n"
					+ "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == true && southExit == false && eastExit == true && westExit == false) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx         \r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == true && southExit == true && eastExit == false && westExit == false) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		//ONE EXIT
		if(northExit == true && southExit == false && eastExit == false && westExit == false) {
			System.out.println("xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == false && southExit == true && eastExit == false && westExit == false) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\n");
			
		}
		
		if(northExit == false && southExit == false && eastExit == true && westExit == false) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxx         \r\n"
					 + "xxxxx         \r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		if(northExit == false && southExit == false && eastExit == false && westExit == true) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "         xxxxx\r\n"
				         + "         xxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
		
		//ZERO EXITS 
		if(northExit == false && southExit == false && eastExit == false && westExit == false) {
			System.out.println("xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxx    xxxxx\r\n"
					 + "xxxxxxxxxxxxxx\r\n"
					 + "xxxxxxxxxxxxxx\n");
			
		}
	}
}
