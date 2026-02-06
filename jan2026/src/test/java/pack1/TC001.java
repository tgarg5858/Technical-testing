package pack1;

public class TC001 {
	private static double width= 20;
	private static double height= 20;
	private static double depth= 20;
	private static  int boxid;
	
	public static double volume() {
		double temp=0;
		try {
			temp=width*height*depth;
		}
		catch(Exception e) {
			
		}
		return temp;
	}
}
