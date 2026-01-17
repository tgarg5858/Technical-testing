package pack1;

public class TC_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{int d = 0;
		int a = 50/d;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("final block");
		}
		System.out.println("welcome to java");
	}

}
