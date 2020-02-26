
public class Main {
	public static boolean EqualSides(int sideLength1, int sideLength2, int sideLength3, int sideLength4) {
		if((sideLength1 == sideLength2) & (sideLength3 == sideLength4) & (sideLength1 == sideLength3)) return true;
		else return false;
	}
	
	public static boolean EqualAngles(int angle1, int angle2, int angle3, int angle4) {
		if((angle1 == angle2) & (angle3 == angle4) & (angle1 == angle3)) return true;
		else return false;
	}
	
	public static boolean IsConnected(int startSide1, int stopSide1,int startSide2, int stopSide2,int startSide3, int stopSide3,int startSide4, int stopSide4) {
		if((startSide1 != stopSide4) & (stopSide1 == startSide2) & (stopSide2 == startSide3) & (stopSide3 == startSide4)) return true;
		//The first conditional should be ==
		else return false;
	}
}
