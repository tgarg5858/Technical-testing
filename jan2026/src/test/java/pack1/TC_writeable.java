package pack1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class TC_writeable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		
		String text=sc.nextLine();
		FileWriter fw =new FileWriter("C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt");
		fw.write(text);
		fw.close();
	}

}
