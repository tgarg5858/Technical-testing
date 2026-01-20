package pack1;

import java.io.FileInputStream;
import java.io.IOException;

public class TC_FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		fis.close();
	
	}

}
