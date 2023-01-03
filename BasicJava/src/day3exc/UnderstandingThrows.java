package day3exc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UnderstandingThrows {

	/*
	 * In order to understand throws we are using File class 
	 * u simpily igonre the File handling concepts
	 * */
	
	public static void main(String[] args) {
		
		
		File f = new File("file1");
		File f2 = new File("file2");
		
		
		f.renameTo(f2);
		
		/* below buffered reader code gives u compile error*/
		/* becoz  br.readLine() is declared using throws clause*/
		/* throws clause enforce developer to call the method from try-catch bloack*/
		try {
		BufferedReader br = new BufferedReader(new FileReader(f));
		
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
