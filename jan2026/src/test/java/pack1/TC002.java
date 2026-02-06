package pack1;

public class TC002 {
	public static int num= 20;
	public static void main(String[] args) {
		
		
		try {
			if(num%2==0) {
				System.out.println("even number");
			}
			else {
				System.out.println("even number");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int marks=75;
		if(marks>=90) {
			System.out.println("grade A");
		}
		else if(marks>=75) {
			System.out.println("grade B");
		}
		else {
			System.out.println("grade C");
		}
		
		
		int day=1;
		switch(day){
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		
		default : System.out.println("hahaha");
		}
		
		
		for(int i=1;i<=5;i++) {
		System.out.println(i);
		}
		
		
		int j=1;
		while(j<=5)
		{
		System.out.println(j++);
		}
		
		
		int k=1;
		do
		{
		System.out.println(k++);
		}while(k<=5);
		
	}

}
