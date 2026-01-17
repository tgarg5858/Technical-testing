package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the size");
		 int n = sc.nextInt();
		 
		 String[] product =new String[n];
		 for(int i=0;i<n;i++) {
			 System.out.println("Enter the name");
			 product[i]=sc.next();
		 }
		 Arrays.sort(product);
		 for(String i:product) {
			 System.out.println(i);
		 }
		 
		 
		
			
	}

}
