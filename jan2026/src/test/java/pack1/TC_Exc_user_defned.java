package pack1;

import java.util.Scanner;

class AgeException extends Exception
{
	
	private static final long serialVersionUID = 1L;
	private int age;
	
	AgeException(int a)
	{
		this.age=a;
	}
	
	public String toString()
	{
		return age+"  is an invalid age";
	}
}
class emp
{
	String name;
	int age;
	
	void getempdetails() throws AgeException
	{
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		if(age<16)
		{
			throw new AgeException(age);
		}
	}
	}

public class TC_Exc_user_defned {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		emp obj=new emp();
		obj.getempdetails();
        }
	}


