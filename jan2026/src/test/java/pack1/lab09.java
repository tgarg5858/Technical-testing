package pack1;

public class lab09 {
	public static boolean StringIsPositive(String str) {
		  String sb = str.toUpperCase();
		  if(str.length() == 0) return true;
		   
		  
		 for(int i=0;i<sb.length()-1;i++) {
			 if(sb.charAt(i) > sb.charAt(i+1)) return false;
		 }
		 return true;
	  }
	  public static void main(String args[]) {
		  String str = "AnT";
		  
		  System.out.println(StringIsPositive(str));
	  }
}
