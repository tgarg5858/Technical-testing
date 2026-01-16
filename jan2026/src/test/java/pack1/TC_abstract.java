package pack1;

abstract class shape {
	
abstract void draw();
	
}
 
class rectangle extends shape{
	void draw() {
		System.out.println("Is is rectangle");
	}
}
 
public class TC_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rect = new rectangle();
		rect.draw();

	}

}
