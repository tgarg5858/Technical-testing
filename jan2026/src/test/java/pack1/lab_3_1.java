package pack1;

import java.util.Scanner;


public class lab_3_1 {
	
	public static void main(String[] args){
		
	
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String firstname = sc.nextLine();
		System.out.println("lastname");
		String lastname = sc.nextLine();
		
		
		if(firstname.trim().isEmpty()|| lastname.trim().isEmpty()) {
			throw new Exception("name blank");
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		}
	

}
