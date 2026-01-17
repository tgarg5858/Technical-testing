package pack1;

public class TC_exception1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			String str =null;
			str.equals("Hello");
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Welcome to java");
		Thread.sleep(10000);
		System.out.println("Welcome to java");

	}

}
