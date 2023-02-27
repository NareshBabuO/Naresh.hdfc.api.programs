package com.hdfc.bank.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fileReader = new FileReader("Input.txt");
		
			//int n = fileReader.read();
		
			int n=0;
		  
		
		while( (n=fileReader.read())	 !=-1) {
			System.out.println((char)n);
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
