package pack1;

import java.util.*;

public class Lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if(age>15) {
				System.out.println("valid age");
			}
			else {
				throw new Exception("invalid age");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
