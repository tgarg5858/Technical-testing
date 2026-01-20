package pack1;

import java.io.*;
public class lab_4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			if((int)data >= '0' && (int)data <= '9'&& (int)data%2==0)
			System.out.print((char)data+" ");
		}
		fis.close();
	}

}
