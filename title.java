
public class Title {
	public class Title {
		final static String ANSI_BLACK = "\u001B[0m";
	    final static String ANSI_YELLOW = "\u001B[33m";
	    final static String ANSI_CYAN = "\u001B[36m";
	    final static String ANSI_GREEN = "\u001B[32m";
	    final static String ANSI_RED = "\u001B[31m";
		final static String ANSI_WHITE = "\u001B[37m";
	    
	    public static void drawTitle() {
			// Draws the title
	    		System.out.println(ANSI_YELLOW + "===============================================================================================");
				System.out.print(ANSI_CYAN  + ""
						+ ANSI_RED + "    _____ _          _                   "+ ANSI_BLACK + " ___   "+ ANSI_CYAN +" __        __    _                 _      _ \r\n"
						+ ANSI_RED + "   |  ___(_)_ __ ___| |__   ___  _   _  "+ ANSI_BLACK + " ( _ )"+ ANSI_CYAN +"   \\ \\      / /_ _| |_ ___ _ __ __ _(_)_ __| |\r\n"
						+ ANSI_RED + "   | |_  | | '__/ _ \\ '_ \\ / _ \\| | | |"+ ANSI_BLACK +"  / _ \\/\\ "+ ANSI_CYAN +" \\ \\ /\\ / / _` | __/ _ \\ '__/ _` | | '__| |\r\n"
						+ ANSI_RED + "   |  _| | | | |  __/ |_) | (_) | |_| | "+ ANSI_BLACK +"| (_>  <  "+ ANSI_CYAN +" \\ V  V / (_| | ||  __/ | | (_| | | |  | |\r\n"
						+ ANSI_RED + "   |_|   |_|_|  \\___|_.__/ \\___/ \\__, | "+ ANSI_BLACK +" \\___/\\/"+ ANSI_CYAN +"    \\_/\\_/ \\__,_|\\__\\___|_|  \\__, |_|_|  |_|\r\n"
						+ ANSI_RED + "                                 |___/                   "+ ANSI_CYAN +"                    |___/          \r\n"
						+ "");
				System.out.println(ANSI_YELLOW + "===============================================================================================");
				System.out.println(ANSI_BLACK + "=================================== PRESS 'SPACEBAR' TO START ====================================");
			
		}
	}
}
