package pack1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;




public class lab_4_1 {
	
	static void io(StringBuilder str) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt");
	
	int data;
	while((data=fis.read())!=-1)
	{
		str.append((char)data);
		System.out.print((char)data);
	}
	
	fis.close();
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder();
		io(str);
		str.reverse();
		FileWriter fw =new FileWriter("C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt");
		fw.write(str.toString());
		fw.close();
		
	}

}
