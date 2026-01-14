package pack1;

 import java.util.Scanner;


public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloo world ..!");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(a);
		
		int a= 10;
		int b= 20;
		
		System.out.println("Addition " + (a+b));
		System.out.println("Subtraction " + (a-b));
		System.out.println("Multiplication " + (a*b));
		System.out.println("division " + (a/b));
		System.out.println("Increment " + (a++));
		
		int age = 30;
		if(age > 18 & age <= 100)
		{
			System.out.println("you are eligile to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
		
		
		

	}

}
