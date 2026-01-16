package pack1;

import java.util.regex.*;

public class TC_Regular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="1234567890";
		String regex="\\d{10}";
		
		Pattern p =Pattern.compile(regex);
		Matcher m=p.matcher(input);
		boolean result=m.matches();
		if(result == true) {
			System.out.println("valid number");
		}
		else {
			System.out.println("Invalid number");
		}
		
		String input1="today is monday and tomorrow is tuesday and";
		Pattern pattern=Pattern.compile("and");
		Matcher match=pattern.matcher(input1);
		System.out.println(match.matches());
		
		while(match.find())
				{
			System.out.println(match.group()+":"+match.start()+":"+match.end());
				}
		
		String input2 ="Exo1";
		String regex2="^[A-Z].*[0-9]$";
		
		Pattern p2 =Pattern.compile(regex2);
		Matcher m2=p2.matcher(input2);
		boolean result2=m2.matches();
		if(result2 == true) {
			System.out.println("matching");
		}
		else {
			System.out.println("not matching");
		}
		
		
	}

}
