package com.hdfc.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------InputStream----");
		try {
			FileInputStream reader = new FileInputStream("Input.txt");
		
		
			int n=0;
		  
		
		while( (n=reader.read()) !=-1) {
			System.out.print((char)n);
		}
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
