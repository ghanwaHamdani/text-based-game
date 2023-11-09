//text based game

import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//map
	Room [] map = { new Room(0,   0, 10,  1,  0), //exit south + east
					new Room(1,   1,  1,  2,  0), //exit north + south
					new Room(2,   2, 12,  3,  1), //exit south + east + north
					new Room(3,   3,  3,  3,  2), //exit west
					new Room(4,   4, 14,  5,  4), //exit south + east
					new Room(5,   5,  5,  6,  4), //exit east + west
					new Room(6,   6, 16,  6,  5), //exit west + south
					new Room(7,   7, 17,  8,  7), //exit south + east
					new Room(8,   8,  8,  9,  7), //exit west + east 
					new Room(9,   9, 19,  9,  8), //exit west + south
					
					new Room(10,  0, 10, 10, 10), //exit north
					new Room(11, 11, 21, 12, 11), //exit south + east
					new Room(12,  2, 22, 13, 11), //exit north + south + east + west
					new Room(13, 13, 23, 13, 12), //exit west + south
 					new Room(14,  4, 24, 15, 14), //exit north + south + east
					new Room(15, 15, 25, 15, 14), //exit south + west 
					new Room(16,  6, 26, 17, 16), //exit north + south + east
					new Room(17,  7, 17, 17, 16), //exit north + west
					new Room(18, 18, 28, 19, 18), //exit south + east 
					new Room(19,  9, 19, 19, 18), //exit north + west 
					
					new Room(20, 20, 30, 21, 20), //exit south + east
					new Room(21, 11, 21, 21, 20), //exit north + west 
					new Room(22, 12, 22, 23, 22), //exit north + east
					new Room(23, 13, 23, 23, 22), //exit north + west
					new Room(24, 14, 34, 25, 24), //exit north + south + east
					new Room(25, 15, 35, 25, 24), //exit north + south + west
					new Room(26, 16, 36, 26, 26), //exit north + south
					new Room(27, 27, 37, 28, 27), //exit south + east
					new Room(28, 18, 38, 29, 27), //exit north + south + east + west
					new Room(29, 29, 39, 29, 28), //exit south + west
					
					new Room(30, 20, 40, 30, 30), //exit north + south
					new Room(31, 31, 41, 32, 31), //exit south + east
					new Room(32, 32, 42, 33, 31), //exit south + east + west
					new Room(33, 33, 33, 33, 32), //exit west
					new Room(34, 24, 34, 34, 34), //exit north
					new Room(35, 25, 45, 36, 35), //exit north + south + east
					new Room(36, 26, 46, 36, 35), //exit north + south + west
					new Room(37, 27, 47, 38, 37), //exit north + south + east
					new Room(38, 28, 38, 38, 37), //exit north + west
					new Room(39, 29, 49, 39, 39), //exit north + south
					
					new Room(40, 30, 40, 41, 40), //exit north + east
					new Room(41, 31, 51, 41, 40), //exit north + south + west
					new Room(42, 32, 42, 42, 42), //exit north
					new Room(43, 43, 53, 44, 43), //exit south + east
					new Room(44, 44, 54, 44, 43), //exit south + west
					new Room(45, 35, 45, 45, 45), //exit north (this is the boss room so the exit closes once the player enters)
					new Room(46, 36, 56, 47, 46), //exit north + south + east
					new Room(47, 37, 57, 47, 46), //exit north + south + west
					new Room(48, 48, 48, 49, 48), //exit east
					new Room(49, 39, 59, 49, 48), //exit north + south + west
					
					new Room(50, 50, 60, 51, 50), //exit south + east
					new Room(51, 41, 51, 52, 51), //exit north + east + west
					new Room(52, 52, 52, 53, 51), //exit east + west
					new Room(53, 43, 63, 53, 52), //exit north + south + west
					new Room(54, 44, 54, 55, 54), //exit north + east
					new Room(55, 55, 55, 56, 54), //exit east + west
					new Room(56, 46, 56, 57, 55), //exit north + east + west
					new Room(57, 47, 57, 57, 56), //exit north + west
					new Room(58, 58, 68, 59, 58), //exit south + east
					new Room(59, 49, 59, 59, 58), //exit north + east
					
					new Room(60, 50, 70, 61, 60), //exit north + south + east
					new Room(61, 61, 61, 62, 60), //exit east + west
					new Room(62, 62, 72, 63, 61), //exit south + east + west
					new Room(63, 53, 63, 64, 62), //exit north + east + west
					new Room(64, 64, 74, 65, 63), //exit south + east + west
					new Room(65, 65, 75, 65, 64), //exit south + west
					new Room(66, 66, 76, 67, 66), //exit south + east
					new Room(67, 67, 67, 68, 66), //exit east + west
					new Room(68, 58, 68, 69, 67), //exit north + east + west
					new Room(69, 69, 79, 69, 68), //exit south + west
					
					new Room(70, 60, 70, 71, 70), //exit north + east
					new Room(71, 71, 81, 71, 70), //exit south + west
					new Room(72, 62, 72, 73, 72), //exit north + east
					new Room(73, 73, 83, 73, 72), //exit south + west
					new Room(74, 64, 73, 73, 73), //exit north
					new Room(75, 65, 85, 75, 75), //exit north + south
					new Room(76, 66, 86, 76, 76), //exit north + south
					new Room(77, 77, 87, 78, 77), //exit south + east
					new Room(78, 78, 78, 79, 77), //exit east + west
					new Room(79, 69, 89, 79, 78), //exit north + south + west
					
					new Room(80, 80, 90, 81, 80), //exit south + east
					new Room(81, 71, 81, 82, 80), //exit north + east + west
					new Room(82, 82, 92, 82, 81), //exit south + west
					new Room(83, 73, 83, 84, 83), //exit north + east
					new Room(84, 84, 84, 85, 83), //exit east + west
					new Room(85, 75, 95, 86, 84), //exit north + south + east + west
					new Room(86, 76, 96, 86, 85), //exit north + south + west
					new Room(87, 77, 97, 88, 87), //exit north + south + east
					new Room(88, 88, 98, 89, 87), //exit south + east + west
					new Room(89, 79, 99, 89, 88), //exit north + south + west
					
					new Room(90, 80, 90, 91, 90), //exit north + east
					new Room(91, 91, 91, 92, 90), //exit east + west
					new Room(92, 82, 92, 93, 91), //exit north + east + west
					new Room(93, 93, 93, 94, 92), //exit east + west
					new Room(94, 94, 94, 95, 93), //exit east + west
					new Room(95, 85, 95, 95, 94), //exit north + west
					new Room(96, 86, 96, 96, 96), //exit north 
					new Room(97, 87, 97, 97, 97), //exit north
					new Room(98, 88, 98, 99, 98), //exit north + east
					new Room(99, 89, 99, 99, 98), //exit north + west
					
	};

	map[0].drawRoom();
	String chooseExitReturn = map[0].chooseExit();
	map[0].moveRoom(map, chooseExitReturn, 0);
	
	}
}
