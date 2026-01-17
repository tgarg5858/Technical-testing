package pack1;

import java.util.Scanner;

public class lab_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your salary");
			int salary = sc.nextInt();
			if(salary>=3000) {
				System.out.println("valid salary");
			}
			else {
				throw new Exception("invalid salary");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
